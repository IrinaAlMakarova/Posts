package ru.netology

import ru.netology.WallService.add

class Comments
class Likes

data class Post(
    var id: Int,
    val ownerId: Int,
    val fromId: Int,
    val createdBy: Int, // Nullable
    val date: Int,
    val text: String,
    val replyOwnerId: Int,
    val replyPostId: Int,
    val friendsOnly: Int,
    val copyright: String,
    val postType: String,
    val signerId: Int,
    val canPin: Int,
    val canDelete: Boolean,
    val canEdit: Int,
    val isPinned: Int,
    val markedAsAds: Boolean,
    val isFavorite: Boolean,
    val postponedId: Int,
    var comments: Comments?, // Nullable
    var likes: Likes? // Nullable
)

object WallService {
    private var posts = emptyArray<Post>()
    private var recordId: Int = 0

    fun clear() {
        posts = emptyArray()
        recordId = 0 // также здесь нужно сбросить счетчик для id постов, если он у вас используется
    }

    fun add(post: Post): Post {
        recordId++
        post.id = recordId
        posts += post
        return posts.last()
    }

    fun update(postNew: Post): Boolean {
        var flag: Boolean = false
        for (post in posts) {
            if (postNew.id == post.id) {
                var post = postNew
                flag = true
            }
        }
        return flag
    }
}


fun main() {

    var post =
        Post(1, 1, 1, 2, 1234, "Text", 3, 4, 1, "Ist", "post", 13, 1, true, 1, 1, true, false, 14, Comments(), Likes())
    println(add(post))

    post =
        Post(2, 2, 1, 2, 1234, "Text", 3, 4, 1, "Ist", "post", 13, 1, true, 1, 1, true, false, 14, Comments(), Likes())
    println(add(post))
}

