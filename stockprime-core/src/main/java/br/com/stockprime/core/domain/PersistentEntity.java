package br.com.stockprime.core.domain;


import java.io.Serializable;
import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Transient;
import javax.persistence.Version;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder(toBuilder = true)
@MappedSuperclass
public class PersistentEntity implements Serializable {

  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequence_generator")
  @Column(updatable = false, nullable = false)
  private Long id;

  @CreationTimestamp
  @CreatedDate
  @Column(updatable = false, nullable = false)
  private LocalDateTime createdDate;

  @UpdateTimestamp
  @LastModifiedDate
  @Column(nullable = false)
  private LocalDateTime lastModifiedDate;

  @Version
  @Column(nullable = false)
  private Integer version;

  @Transient
  public boolean isPersisted() {
    return this.getId() != null;
  }

}
