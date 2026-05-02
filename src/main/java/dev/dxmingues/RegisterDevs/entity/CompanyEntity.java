package dev.dxmingues.RegisterDevs.entity;

import jakarta.persistence.*;

import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "tb_companies")
public class CompanyEntity {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID companyId;
    private String name;
    @OneToMany(mappedBy = "company")
    private List<DeveloperEntity> developers;
}
