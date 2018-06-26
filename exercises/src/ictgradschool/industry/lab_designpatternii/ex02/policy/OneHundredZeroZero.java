package ictgradschool.industry.lab_designpatternii.ex02.policy;

import ictgradschool.industry.lab_designpatternii.ex02.model.Percentage;
import ictgradschool.industry.lab_designpatternii.ex02.model.StudentResult;

/**
 * A course assessment policy. With this policy, a course is assessed
 * exclusively by exam.
 * 
 */
public class OneHundredZeroZero implements AssessmentPolicy {

	public Percentage calculate(StudentResult result) {
		return result
				.getAssessmentElement(StudentResult.AssessmentElement.Exam);
	}

	public String toString() {
		return "Exam only";
	}

}
