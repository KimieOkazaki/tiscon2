package net.unit8.sigcolle.controller;

import javax.inject.Inject;

import enkan.component.doma2.DomaProvider;
import enkan.data.HttpResponse;
import kotowari.component.TemplateEngine;
import net.unit8.sigcolle.dao.CampaignDao;
import net.unit8.sigcolle.dao.NewCampaignDao;

public class NewCampaignController {
    @Inject
    private TemplateEngine templateEngine;

    @Inject
    private DomaProvider domaProvider;

    public HttpResponse newcampaign(){
        NewCampaignDao NewCampaignDao = domaProvider.getDao(NewCampaignDao.class);
        return templateEngine.render("newcampaign");
    }


}
