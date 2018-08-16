class Library
attr_accessor :books

  def initialize (library_setup)
    @books = library_setup
  end


  def find_book(book_name)
    for book in @books
      if book[:title] == book_name
        return book
      end
    end
  end

  def find_book_rental_info(book_name)
    for book in @books
      if book[:title] == book_name
        return book[:rental_details]
      end
    end
  end

  def add_new_book(book_name)
    @books.push({title: book_name,
      rental_details: {
        student_name: "",
        date: ""}})
  end

  def update_rental_details(book_name, student_name, date)
    for book in @books
      if book[:title] == book_name
        book[:rental_details][:student_name] = student_name
        book[:rental_details][:date] = date
      end
    end
  end


  def change_details(book_name)
      for book in @books
        if book[:title] == book_name
          @books[:rental_details][0] = person
          @books[:rental_details[1]] = date
          return book
        end
      end
    end


end
