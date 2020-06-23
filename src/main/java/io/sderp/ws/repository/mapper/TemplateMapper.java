package io.sderp.ws.repository.mapper;

import io.sderp.ws.model.Template;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TemplateMapper {
    List<Template> selectAllTemplate();
    int insertTemplate(Template template);
}
