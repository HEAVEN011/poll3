package com.briup.apps.poll.bean;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value="答案类")
public class Answers {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column poll_answers.id
     *
     * @mbg.generated Mon Jun 25 16:38:58 CST 2018
     */
	@ApiModelProperty(value="答案编号")
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column poll_answers.selections
     *
     * @mbg.generated Mon Jun 25 16:38:58 CST 2018
     */
	@ApiModelProperty(value="单选答案eg：5|3")
    private String selections;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column poll_answers.checks
     *
     * @mbg.generated Mon Jun 25 16:38:58 CST 2018
     */
	@ApiModelProperty(value="多选答案eg:5,4|3,3")
    private String checks;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column poll_answers.content
     *
     * @mbg.generated Mon Jun 25 16:38:58 CST 2018
     */
	@ApiModelProperty(value="简答答案eg:xxxxxx|xxxxx")
    private String content;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column poll_answers.survey_id
     *
     * @mbg.generated Mon Jun 25 16:38:58 CST 2018
     */
	@ApiModelProperty(value="课调编号")
    private Long surveyId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column poll_answers.id
     *
     * @return the value of poll_answers.id
     *
     * @mbg.generated Mon Jun 25 16:38:58 CST 2018
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column poll_answers.id
     *
     * @param id the value for poll_answers.id
     *
     * @mbg.generated Mon Jun 25 16:38:58 CST 2018
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column poll_answers.selections
     *
     * @return the value of poll_answers.selections
     *
     * @mbg.generated Mon Jun 25 16:38:58 CST 2018
     */
    public String getSelections() {
        return selections;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column poll_answers.selections
     *
     * @param selections the value for poll_answers.selections
     *
     * @mbg.generated Mon Jun 25 16:38:58 CST 2018
     */
    public void setSelections(String selections) {
        this.selections = selections == null ? null : selections.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column poll_answers.checks
     *
     * @return the value of poll_answers.checks
     *
     * @mbg.generated Mon Jun 25 16:38:58 CST 2018
     */
    public String getChecks() {
        return checks;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column poll_answers.checks
     *
     * @param checks the value for poll_answers.checks
     *
     * @mbg.generated Mon Jun 25 16:38:58 CST 2018
     */
    public void setChecks(String checks) {
        this.checks = checks == null ? null : checks.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column poll_answers.content
     *
     * @return the value of poll_answers.content
     *
     * @mbg.generated Mon Jun 25 16:38:58 CST 2018
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column poll_answers.content
     *
     * @param content the value for poll_answers.content
     *
     * @mbg.generated Mon Jun 25 16:38:58 CST 2018
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column poll_answers.survey_id
     *
     * @return the value of poll_answers.survey_id
     *
     * @mbg.generated Mon Jun 25 16:38:58 CST 2018
     */
    public Long getSurveyId() {
        return surveyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column poll_answers.survey_id
     *
     * @param surveyId the value for poll_answers.survey_id
     *
     * @mbg.generated Mon Jun 25 16:38:58 CST 2018
     */
    public void setSurveyId(Long surveyId) {
        this.surveyId = surveyId;
    }
}