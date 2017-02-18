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

        private String newCampaignTitle;

        // Markdown description
        private String newCampaignStatement;

        private Long newCampaignGoal;

        private Long createUserId;

}
