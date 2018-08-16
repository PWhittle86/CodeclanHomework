def pet_shop_name(shop)
  return shop[:name]
end

def total_cash(shop)
  return shop[:admin][:total_cash]
end

def add_or_remove_cash(shop, cash)
  shop[:admin][:total_cash] += cash
end

def pets_sold(shop)
  shop[:admin][:pets_sold]
end

def increase_pets_sold(shop, no_of_pets)
  shop[:admin][:pets_sold] += no_of_pets
end

def stock_count(shop)
  total_pets = 0
  for animal in shop[:pets]
    total_pets += 1
  end
  return total_pets
end

def pets_by_breed(shop, breed_to_check)
  total_breeds = []

  for animal in shop[:pets]
    if animal[:breed] == breed_to_check
      total_breeds.push(breed_to_check)
    end
  end
return total_breeds
end

def find_pet_by_name(shop, name_to_check)
  for animal in shop[:pets]
    if animal[:name] == name_to_check
      return animal
    end
  end
  return nil
end

def remove_pet_by_name(shop, pet_to_be_removed)
  for animal in shop[:pets]
    if animal[:name] == pet_to_be_removed
      shop[:pets].delete(animal)
    end
  end
end

def add_pet_to_stock(shop, new_pet)
  shop[:pets].push(new_pet)
end

def customer_cash(customer)
  return customer[:cash]
end

def remove_customer_cash(customer, deduction)
  customer[:cash] -= deduction
end

def customer_pet_count(customer)
  return customer[:pets].count
end

def add_pet_to_customer(customer, pet)
  customer[:pets].push(pet)
end

def customer_can_afford_pet(customer, pet)
  if customer[:cash] >= pet[:price]
    return true
  else
    return false
  end
end

def sell_pet_to_customer(shop, pet, customer)
  for animal in shop[:pets]
    if animal == pet && customer[:cash] >= pet[:price]
      add_pet_to_customer(customer, pet)
      increase_pets_sold(shop, 1)
      remove_customer_cash(customer, pet[:price])
      add_or_remove_cash(shop, pet[:price])
    end
  end
end
