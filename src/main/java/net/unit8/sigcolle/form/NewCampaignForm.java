package net.unit8.sigcolle.form;
import java.util.List;

import javax.validation.constraints.NotNull;

import lombok.Data;
import net.unit8.sigcolle.validator.Password;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;

public class NewCampaignForm extends FormBase {
    @NotNull
    @Length(min = 1, max = 20)
    @Password
    private String createUserName;

    @NotNull
    @Length(min = 1, max = 100)
    private String newCampaignTitle;

    @NotNull
    @Length(min = 1, max = 1000)
    private String newCampaignStatement;

    @NotNull
    @Length(min = 1, max = 6)
    private int newCampaginGoal;

    @Override
    public boolean hasErrors() {
        return super.hasErrors();
    }

    @Override
    public boolean hasErrors(String name) {
        return super.hasErrors(name);
    }

    @Override
    public List<String> getErrors(String name) {
        return super.getErrors(name);
    }




}
