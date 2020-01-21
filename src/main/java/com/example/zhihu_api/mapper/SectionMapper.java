package com.example.zhihu_api.mapper;

import com.example.zhihu_api.entity.Section;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author Lenovo
 */
public interface SectionMapper {
/**
 * 批量插入
 * @param sections
 */
@Insert("<script>"+
"INSERT INTO t_section (section_id,special_id,section_title) VALUES"+
"<foreach collection=\"list\" item=\"section\" index=\"index\" separator=\",\">"+
"(#{section.sectionId},#{section.specialId},#{section.sectionTitle})"+
"</foreach>"+
"</script>")
@Options(useGeneratedKeys = true,keyProperty = "section_id")
void batchInsert(@Param("list") List<Section> sections);
    /**
     * 根据专题id查询标签列表
     *
     * @param specialId
     * @return List<Section>
     */
    @Select("SELECT * FROM t_section WHERE special_id = #{specialId}")
    List<Section> getSectionsBySpecialId(String specialId);
}
