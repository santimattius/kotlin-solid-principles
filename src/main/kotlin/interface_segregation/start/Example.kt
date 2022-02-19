package interface_segregation.start

import java.util.*

interface Product {
    val name: String
    val stock: Int
    val releaseDate: Date
    val recommendedAge: Int
}

class Cd(
    override val name: String,
    override val stock: Int,
    override val releaseDate: Date
) : Product {

    //This is problem
    override val recommendedAge: Int
        get() = throw UnsupportedOperationException()
}

class Dvd(
    override val name: String,
    override val stock: Int,
    override val releaseDate: Date,
    override val recommendedAge: Int
) : Product