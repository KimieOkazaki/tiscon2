package net.unit8.sigcolle.model;

import java.io.Serializable;

import lombok.Data;
import org.seasar.doma.Entity;
import org.seasar.doma.GeneratedValue;
import org.seasar.doma.GenerationType;
import org.seasar.doma.Id;

public class NewCampaign implements Serializable {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)

        private String NewCampaignTitle;

        // Markdown description
        private String NewCampaignStatement;

        private Long NewCampaignGoal;

        private Long createUserId;

}
