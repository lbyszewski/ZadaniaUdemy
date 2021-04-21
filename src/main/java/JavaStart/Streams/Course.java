package JavaStart.Streams;

import java.util.Objects;

public class Course {
    private int courseId;
    private String name;
    private double price;
    private String category;

    public Course(int courseId, String name, double price, String category) {
        this.courseId = courseId;
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseId=" + courseId +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", category='" + category + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Course course = (Course) o;
        return courseId == course.courseId && Double.compare(course.price, price) == 0 && name.equals(course.name) && category.equals(course.category);
    }

    @Override
    public int hashCode() {
        return Objects.hash(courseId, name, price, category);
    }
}
