package crazypco.start.main.entitys;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@ToString
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	 @Column(length = 20, nullable = false)
	private String userid;
	 @Column(length = 20, nullable = false)
	private String username;
	 @Column(length = 20, nullable = false)
	private String userpassword;
	 @Column(length = 20, nullable = false)
	private String email;
	 @Column(length = 20, nullable = false)
	private String phonenumber;
	 @Column(length = 20, nullable = false)
	private int age;
	 @Column(length = 20, nullable = false)
	private String isuse;
	 @UpdateTimestamp
	 @Column(length = 20, nullable = false)
	private LocalDateTime  updatedate;
	 @CreationTimestamp
	 @Column(length = 20, nullable = false)
	private LocalDateTime  createdate;
	
	 
}
