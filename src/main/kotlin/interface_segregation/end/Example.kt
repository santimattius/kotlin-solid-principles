package interface_segregation.end

import java.util.*

interface Product {
    val name: String
    val stock: Int
    val releaseDate: Date
}

interface AgeAware {
    val recommendedAge: Int
}

class Cd(
    override val name: String,
    override val stock: Int,
    override val releaseDate: Date
) : Product

class Dvd(
    override val name: String,
    override val stock: Int,
    override val releaseDate: Date,
    override val recommendedAge: Int
) : Product, AgeAware