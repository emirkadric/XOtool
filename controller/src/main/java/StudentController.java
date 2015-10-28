import com.iaeste.entityModels.StudentsEntity;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by emirk on 28/10/2015.
 */
@RestController
public class StudentController {

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.OK)
    public StudentsEntity addStudent(StudentsEntity studentsEntity) throws MissingServletRequestParameterException
    {
        StudentsEntity se = studentService.addNewStudent(studentsEntity);

        return se;
    }

}
