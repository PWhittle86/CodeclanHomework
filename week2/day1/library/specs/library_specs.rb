require("minitest/autorun")
require("minitest/rg")
require_relative("../library.rb")

class TestLibrary < Minitest::Test

  def setup

    @library_setup =
    [{title: "Lord Of The Rings",
      rental_details: {
        student_name: "Richard",
        date: "01/12/16"}},
    {title: "His Dark Materials",
      rental_details: {
        student_name: "Campbell",
        date: "01/12/17"}},
        {title: "Fahrenheit 451",
          rental_details: {
            student_name: "Craig",
            date: "01/12/18"}}]

        @compiled_library = Library.new(@library_setup)
  end

  # Create a class for a Library that has an array of books.
  # Each book should be a hash with a title, which is a string, and rental details,
  # which is another hash with a student name and due date.
  # Create a getter for the books

  def test_book_getter

    assert_equal([{title: "Lord Of The Rings",
      rental_details: {
        student_name: "Richard",
        date: "01/12/16"}},
    {title: "His Dark Materials",
      rental_details: {
        student_name: "Campbell",
        date: "01/12/17"}},
        {title: "Fahrenheit 451",
          rental_details: {
            student_name: "Craig",
            date: "01/12/18"}}], Library.new(@library_setup).books) #The full, proper way to create a class instance, then to use a getter to pull the data. compiled_library used from now on for ease.
  end

  # Create a method that takes in a book title and returns all of the information about that book.

  def test_find_book
    found_book = @compiled_library.find_book("Lord Of The Rings")
    p found_book
    assert_equal({title: "Lord Of The Rings",
      rental_details: {
        student_name: "Richard",
        date: "01/12/16"}}, found_book)
  end

  # Create a method that takes in a book title and returns only the rental details for that book.

  def test_find_book_rental_info
    rental_info = @compiled_library.find_book_rental_info("Lord Of The Rings")
    assert_equal({
      student_name: "Richard",
      date: "01/12/16"}, rental_info)
  end

  # Create a method that takes in a book title and adds it
  # to our book list (add a new hash for the book with the student
  # name and date being left as empty strings).

  def test_add_new_book
    library_plus_new_book = @compiled_library.add_new_book("Nineteen Eighty Four")
    assert_equal(@compiled_library.books, library_plus_new_book)
  end

  # Create a method that changes the rental details of a book by
  # taking in the title of the book, the student renting it and
  # the date it's due to be returned.

  def test_update_rental_details #THIS IS A BAD TEST!
    library_plus_updated_book = @compiled_library.update_rental_details("His Dark Materials", "Pete", "01/12/18")
    assert_equal(@compiled_library.books, library_plus_updated_book)
  end

end
