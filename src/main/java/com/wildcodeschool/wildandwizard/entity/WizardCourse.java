package com.wildcodeschool.wildandwizard.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity

public class WizardCourse {
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;

@ManyToOne
@JoinColumn(name = "wizard_id")
private Wizard wizard;

@ManyToOne
@JoinColumn(name = "course_id")
private Course course;

public WizardCourse () {}
  
}
