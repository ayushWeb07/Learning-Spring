package com.ayush.backend.job.entities;

import com.ayush.backend.company.entities.CompanyEntity;
import com.ayush.backend.contact.enums.ContactStatus;
import com.ayush.backend.entities.BaseEntity;
import com.ayush.backend.job.enums.JobStatus;
import com.ayush.backend.job.enums.WorkType;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.UUID;

@Entity
@Table(name = "jobs")
@Getter
@Setter
public class JobEntity extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @ManyToOne(fetch = FetchType.EAGER)
    @OnDelete(action= OnDeleteAction.CASCADE)
    @JoinColumn(name = "company_id", nullable = false)
    private CompanyEntity company;

    @Column(name = "title", nullable = false, length = 255)
    private String title;

    @Column(name = "location", nullable = false, length = 300)
    private String location;

    @Enumerated(EnumType.STRING)
    @Column(name = "work_type", nullable = false)
    private WorkType workType;

    @Column(name = "experience_level", nullable = false, length = 50)
    private String experienceLevel;

    @Column(name = "min_salary", nullable = false, precision = 12, scale = 2)
    private BigDecimal minSalary;

    @Column(name = "max_salary", nullable = false, precision = 12, scale = 2)
    private BigDecimal maxSalary;

    @Column(name = "description", nullable = false, columnDefinition = "TEXT")
    @Lob
    private String description;

    @Column(name = "requirements", nullable = false, columnDefinition = "TEXT")
    @Lob
    private String requirements;

    @Column(name = "posted_date", nullable = false)
    private Instant postedDate;

    @Column(name = "application_deadline", nullable = false)
    private Instant applicationDeadline;

    @Column(name = "applications_count", nullable = false)
    private Long applicationsCount;

    @Enumerated(EnumType.STRING)
    @Column(name = "job_status", nullable = false)
    private JobStatus jobStatus;
}
