package test.jwd.task0.repository;

import by.jwd.task0.entity.CustomArray;
import by.jwd.task0.exception.CustomArrayException;
import by.jwd.task0.repository.CustomRepository;
import by.jwd.task0.repository.Specification;
import by.jwd.task0.repository.impl.IdSpecification;
import by.jwd.task0.repository.impl.MaxSpecification;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.*;

public class CustomRepositoryTest {

    @BeforeClass
    public void setUp() {

        CustomArray array1 = new CustomArray(1, 2, 3, 4, 5);
        CustomArray array2 = new CustomArray(4, 7, 2, 10);
        CustomArray array3 = new CustomArray(0, 4, 9, 8, 3);
        CustomArray array4 = new CustomArray(6, 7, 2, 3);
        CustomArray array5 = new CustomArray(6, 4, 8, 7);

        CustomRepository repository = CustomRepository.getInstance();

        repository.add(array1);
        repository.add(array2);
        repository.add(array3);
        repository.add(array4);
        repository.add(array5);
    }

    @Test
    public void queryIdSpecificationTest() throws CustomArrayException {
        Specification<CustomArray> idSpecification = new IdSpecification(1);

        CustomRepository repository = CustomRepository.getInstance();

        List<CustomArray> customArrayList = repository.getListOfArrays();

        List<CustomArray> testList = repository.query(idSpecification);

        CustomArray actual = testList.get(0);
        CustomArray expected = customArrayList.get(0);

        assertEquals(actual, expected);
    }

    @Test
    public void queryMaxSpecificationTest() throws CustomArrayException {
        Specification<CustomArray> maxSpecification = new MaxSpecification(10);

        CustomRepository repository = CustomRepository.getInstance();

        List<CustomArray> customArrayList = repository.getListOfArrays();

        List<CustomArray> testList = repository.query(maxSpecification);

        CustomArray actual = testList.get(0);
        CustomArray expected = customArrayList.get(1);

        assertEquals(actual, expected);
    }



}