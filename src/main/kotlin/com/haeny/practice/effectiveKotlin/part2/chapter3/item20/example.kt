package com.haeny.practice.effectiveKotlin.part2.chapter3.item20

class SourceResponse(
    val sources: List<Source>
) {
    class Source(
        val id: Long,
        val category: String,
        val country: String,
        val description: String,
    )
}

class SourceEntity(
    var id: Long = 0L,
    var category: String = "",
    var country: String = "",
    var description: String = "",
)

class Database {
    fun insertSource(sources: List<SourceEntity>) {

    }
}

val db = Database()

// as-is
fun saveCallResult(item: SourceResponse) {
    var sourceList = ArrayList<SourceEntity>()
    item.sources.forEach {
        var sourceEntity = SourceEntity()
        sourceEntity.id = it.id
        sourceEntity.category = it.category
        sourceEntity.country = it.country
        sourceEntity.description = it.description
        sourceList.add(sourceEntity)
    }
    db.insertSource(sourceList)
}

// to-be
fun saveCallResult2(item: SourceResponse) {
    val sourceEntities = item.sources.map(::sourceToEntity)
    db.insertSource(sourceEntities)
}

private fun sourceToEntity(source: SourceResponse.Source) = SourceEntity()
    .apply {
        id = source.id
        category = source.category
        country = source.country
        description = source.description
    }

fun Iterable<Int>.product() =
    fold(1) { acc, i -> acc * i}