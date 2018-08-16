require("minitest/autorun")
require("minitest/rg")
require_relative("../student")

class TestStudent < MiniTest::Test

  # Create a class called Student that takes in a name (String)
  # and a cohort (String) when an new instance is created.
  #
  # Create a couple of Getter methods, one that returns the name property
  # and one that returns the cohort property of the student.

  def test_student_name
    student = Student.new("Pete", "G6")
    assert_equal("Pete", student.name())
  end

  def test_student_cohort
    student = Student.new("Pete", "G6")
    assert_equal("G6", student.cohort())
  end

  # Add in Setter methods to update the students name and what cohort they are in.

  def test_new_name
    student = Student.new("Pete", "G6")
    student.change_name("Pete W")
    assert_equal("Pete W", student.name)
  end

  def test_new_cohort
    student = Student.new("Pete", "G6")
    student.change_cohort("G7")
    assert_equal("G7", student.cohort)
  end

  # Create a method that gets the student to talk (eg. Returns "I can talk!).

  def test_talk
    student = Student.new("Pete", "G6")
    assert_equal("I can talk!", student.talk)
  end

  # Create a method that takes in a students favourite programming language
  # and returns it as part of a string (eg. student1.say_favourite_language("Ruby") -> "I love Ruby").

  def test_say_favourite_language
    student = Student.new("Pete", "G6")
    assert_equal("I love Ruby.", student.say_favourite_language("Ruby"))
  end


end
