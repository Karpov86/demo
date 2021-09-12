package by.karpov.demo.dao.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Objects;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "usr")
public class UserModel extends AbstractPersistable<Long>
{
	@Column(name = "name")
	private String name;

	@Override
	public boolean equals(Object o)
	{
		if (this == o)
			return true;
		if (getClass() != o.getClass())
			return false;
		if (!super.equals(o))
			return false;
		UserModel userModel = (UserModel) o;
		return Objects.equals(name, userModel.name);
	}

	@Override
	public int hashCode()
	{
		return Objects.hash(super.hashCode(), name);
	}
}


