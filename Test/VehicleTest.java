

import org.junit.jupiter.api.Test;
import seminars.second.hw.Car;
import seminars.second.hw.Motorcycle;
import seminars.second.hw.Vehicle;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class VehicleTest {
    @Test
    void instanceOf() {
        Car car = new Car("BMW", "X5", 2024);
        assertThat(car instanceof Vehicle);
    }

    @Test
    void WheelsCar() {
        Car car = new Car("BMW", "X5", 2024);
        assertThat(car.getNumWheels()).isEqualTo(4);
    }

    @Test
    void MotorcycleWheels() {
        Motorcycle motorcycle = new Motorcycle("Jawa", "cz", 1988);
        assertThat(motorcycle.getNumWheels()).isEqualTo(2);
    }

    @Test
    void testDriveCar() {
        Car car = new Car("BMW", "X5", 2024);
        car.testDrive();
        assertThat(car.getSpeed()).isEqualTo(60);
    }

    @Test
    void testDriveMotorcycle() {
        Motorcycle motorcycle = new Motorcycle("Jawa", "cz", 1988);
        motorcycle.testDrive();
        assertThat(motorcycle.getSpeed()).isEqualTo(75);
    }

    @Test
    void parkCar() {
        Car car = new Car("BMW", "X5", 2024);
        car.testDrive();
        car.park();
        assertThat(car.getSpeed()).isEqualTo(0);
    }


    @Test
    void parkingMotorcycle() {
        Motorcycle motorcycle = new Motorcycle("Jawa", "cz", 1988);
        motorcycle.testDrive();
        motorcycle.park();
        assertThat(motorcycle.getSpeed()).isEqualTo(0);
    }
}