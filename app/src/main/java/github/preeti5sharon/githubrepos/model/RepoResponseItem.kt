package github.preeti5sharon.githubrepos.model


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class RepoResponseItem(
    @Json(name = "allow_forking")
    val allowForking: Boolean?,
    @Json(name = "archive_url")
    val archiveUrl: String?,
    val archived: Boolean?,
    @Json(name = "assignees_url")
    val assigneesUrl: String?,
    @Json(name = "blobs_url")
    val blobsUrl: String?,
    @Json(name = "branches_url")
    val branchesUrl: String?,
    @Json(name = "clone_url")
    val cloneUrl: String?,
    @Json(name = "collaborators_url")
    val collaboratorsUrl: String?,
    @Json(name = "comments_url")
    val commentsUrl: String?,
    @Json(name = "commits_url")
    val commitsUrl: String?,
    @Json(name = "compare_url")
    val compareUrl: String?,
    @Json(name = "contents_url")
    val contentsUrl: String?,
    @Json(name = "contributors_url")
    val contributorsUrl: String?,
    @Json(name = "created_at")
    val createdAt: String?,
    @Json(name = "default_branch")
    val defaultBranch: String?,
    @Json(name = "deployments_url")
    val deploymentsUrl: String?,
    val description: String?,
    val disabled: Boolean?,
    @Json(name = "downloads_url")
    val downloadsUrl: String?,
    @Json(name = "events_url")
    val eventsUrl: String?,
    val fork: Boolean?,
    val forks: Int?,
    @Json(name = "forks_count")
    val forksCount: Int?,
    @Json(name = "forks_url")
    val forksUrl: String?,
    @Json(name = "full_name")
    val fullName: String?,
    @Json(name = "git_commits_url")
    val gitCommitsUrl: String?,
    @Json(name = "git_refs_url")
    val gitRefsUrl: String?,
    @Json(name = "git_tags_url")
    val gitTagsUrl: String?,
    @Json(name = "git_url")
    val gitUrl: String?,
    @Json(name = "has_discussions")
    val hasDiscussions: Boolean?,
    @Json(name = "has_downloads")
    val hasDownloads: Boolean?,
    @Json(name = "has_issues")
    val hasIssues: Boolean?,
    @Json(name = "has_pages")
    val hasPages: Boolean?,
    @Json(name = "has_projects")
    val hasProjects: Boolean?,
    @Json(name = "has_wiki")
    val hasWiki: Boolean?,
    val homepage: String?,
    @Json(name = "hooks_url")
    val hooksUrl: String?,
    @Json(name = "html_url")
    val htmlUrl: String?,
    val id: Int?,
    @Json(name = "is_template")
    val isTemplate: Boolean?,
    @Json(name = "issue_comment_url")
    val issueCommentUrl: String?,
    @Json(name = "issue_events_url")
    val issueEventsUrl: String?,
    @Json(name = "issues_url")
    val issuesUrl: String?,
    @Json(name = "keys_url")
    val keysUrl: String?,
    @Json(name = "labels_url")
    val labelsUrl: String?,
    val language: Any?,
    @Json(name = "languages_url")
    val languagesUrl: String?,
    val license: License?,
    @Json(name = "merges_url")
    val mergesUrl: String?,
    @Json(name = "milestones_url")
    val milestonesUrl: String?,
    @Json(name = "mirror_url")
    val mirrorUrl: Any?,
    val name: String?,
    @Json(name = "node_id")
    val nodeId: String?,
    @Json(name = "notifications_url")
    val notificationsUrl: String?,
    @Json(name = "open_issues")
    val openIssues: Int?,
    @Json(name = "open_issues_count")
    val openIssuesCount: Int?,
    val owner: Owner?,
    val `private`: Boolean?,
    @Json(name = "pulls_url")
    val pullsUrl: String?,
    @Json(name = "pushed_at")
    val pushedAt: String?,
    @Json(name = "releases_url")
    val releasesUrl: String?,
    val size: Int?,
    @Json(name = "ssh_url")
    val sshUrl: String?,
    @Json(name = "stargazers_count")
    val stargazersCount: Int?,
    @Json(name = "stargazers_url")
    val stargazersUrl: String?,
    @Json(name = "statuses_url")
    val statusesUrl: String?,
    @Json(name = "subscribers_url")
    val subscribersUrl: String?,
    @Json(name = "subscription_url")
    val subscriptionUrl: String?,
    @Json(name = "svn_url")
    val svnUrl: String?,
    @Json(name = "tags_url")
    val tagsUrl: String?,
    @Json(name = "teams_url")
    val teamsUrl: String?,
    val topics: List<Any?>?,
    @Json(name = "trees_url")
    val treesUrl: String?,
    @Json(name = "updated_at")
    val updatedAt: String?,
    val url: String?,
    val visibility: String?,
    val watchers: Int?,
    @Json(name = "watchers_count")
    val watchersCount: Int?,
    @Json(name = "web_commit_signoff_required")
    val webCommitSignoffRequired: Boolean?
)