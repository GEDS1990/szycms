package com.publiccms.views.directive.cms;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.publiccms.common.base.AbstractTemplateDirective;
import com.publiccms.common.handler.RenderHandler;
import com.publiccms.common.tools.CommonUtils;
import com.publiccms.entities.cms.CmsVoteItem;
import com.publiccms.logic.service.cms.CmsVoteItemService;

/**
 *
 * CmsVoteItemDirective
 * 
 */
@Component
public class CmsVoteItemDirective extends AbstractTemplateDirective {

    @Override
    public void execute(RenderHandler handler) throws IOException, Exception {
        Long id = handler.getLong("id");
        if (CommonUtils.notEmpty(id)) {
            handler.put("object", service.getEntity(id)).render();
        } else {
            Long[] ids = handler.getLongArray("ids");
            if (CommonUtils.notEmpty(ids)) {
                List<CmsVoteItem> entityList = service.getEntitys(ids);
                Map<String, CmsVoteItem> map = new LinkedHashMap<>();
                for (CmsVoteItem entity : entityList) {
                    map.put(String.valueOf(entity.getId()), entity);
                }
                handler.put("map", map).render();
            }
        }
    }

    @Autowired
    private CmsVoteItemService service;

}
