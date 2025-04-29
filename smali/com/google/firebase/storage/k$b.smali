.class public Lcom/google/firebase/storage/k$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/firebase/storage/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# instance fields
.field a:Lcom/google/firebase/storage/k;

.field b:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/google/firebase/storage/k;

    invoke-direct {v0}, Lcom/google/firebase/storage/k;-><init>()V

    iput-object v0, p0, Lcom/google/firebase/storage/k$b;->a:Lcom/google/firebase/storage/k;

    return-void
.end method

.method constructor <init>(Lorg/json/JSONObject;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/google/firebase/storage/k;

    invoke-direct {v0}, Lcom/google/firebase/storage/k;-><init>()V

    iput-object v0, p0, Lcom/google/firebase/storage/k$b;->a:Lcom/google/firebase/storage/k;

    if-eqz p1, :cond_0

    invoke-direct {p0, p1}, Lcom/google/firebase/storage/k$b;->c(Lorg/json/JSONObject;)V

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/google/firebase/storage/k$b;->b:Z

    :cond_0
    return-void
.end method

.method constructor <init>(Lorg/json/JSONObject;Lcom/google/firebase/storage/l;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/firebase/storage/k$b;-><init>(Lorg/json/JSONObject;)V

    iget-object p1, p0, Lcom/google/firebase/storage/k$b;->a:Lcom/google/firebase/storage/k;

    invoke-static {p1, p2}, Lcom/google/firebase/storage/k;->b(Lcom/google/firebase/storage/k;Lcom/google/firebase/storage/l;)Lcom/google/firebase/storage/l;

    return-void
.end method

.method private b(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    invoke-virtual {p1, p2}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1, p2}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p1, p2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method private c(Lorg/json/JSONObject;)V
    .locals 4

    iget-object v0, p0, Lcom/google/firebase/storage/k$b;->a:Lcom/google/firebase/storage/k;

    const-string v1, "generation"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/google/firebase/storage/k;->i(Lcom/google/firebase/storage/k;Ljava/lang/String;)Ljava/lang/String;

    iget-object v0, p0, Lcom/google/firebase/storage/k$b;->a:Lcom/google/firebase/storage/k;

    const-string v1, "name"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/google/firebase/storage/k;->j(Lcom/google/firebase/storage/k;Ljava/lang/String;)Ljava/lang/String;

    iget-object v0, p0, Lcom/google/firebase/storage/k$b;->a:Lcom/google/firebase/storage/k;

    const-string v1, "bucket"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/google/firebase/storage/k;->k(Lcom/google/firebase/storage/k;Ljava/lang/String;)Ljava/lang/String;

    iget-object v0, p0, Lcom/google/firebase/storage/k$b;->a:Lcom/google/firebase/storage/k;

    const-string v1, "metageneration"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/google/firebase/storage/k;->l(Lcom/google/firebase/storage/k;Ljava/lang/String;)Ljava/lang/String;

    iget-object v0, p0, Lcom/google/firebase/storage/k$b;->a:Lcom/google/firebase/storage/k;

    const-string v1, "timeCreated"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/google/firebase/storage/k;->m(Lcom/google/firebase/storage/k;Ljava/lang/String;)Ljava/lang/String;

    iget-object v0, p0, Lcom/google/firebase/storage/k$b;->a:Lcom/google/firebase/storage/k;

    const-string v1, "updated"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/google/firebase/storage/k;->n(Lcom/google/firebase/storage/k;Ljava/lang/String;)Ljava/lang/String;

    iget-object v0, p0, Lcom/google/firebase/storage/k$b;->a:Lcom/google/firebase/storage/k;

    const-string v1, "size"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    move-result-wide v1

    invoke-static {v0, v1, v2}, Lcom/google/firebase/storage/k;->o(Lcom/google/firebase/storage/k;J)J

    iget-object v0, p0, Lcom/google/firebase/storage/k$b;->a:Lcom/google/firebase/storage/k;

    const-string v1, "md5Hash"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/google/firebase/storage/k;->p(Lcom/google/firebase/storage/k;Ljava/lang/String;)Ljava/lang/String;

    const-string v0, "metadata"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    invoke-virtual {v0}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0, v2, v3}, Lcom/google/firebase/storage/k$b;->i(Ljava/lang/String;Ljava/lang/String;)Lcom/google/firebase/storage/k$b;

    goto :goto_0

    :cond_0
    const-string v0, "contentType"

    invoke-direct {p0, p1, v0}, Lcom/google/firebase/storage/k$b;->b(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {p0, v0}, Lcom/google/firebase/storage/k$b;->h(Ljava/lang/String;)Lcom/google/firebase/storage/k$b;

    :cond_1
    const-string v0, "cacheControl"

    invoke-direct {p0, p1, v0}, Lcom/google/firebase/storage/k$b;->b(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {p0, v0}, Lcom/google/firebase/storage/k$b;->d(Ljava/lang/String;)Lcom/google/firebase/storage/k$b;

    :cond_2
    const-string v0, "contentDisposition"

    invoke-direct {p0, p1, v0}, Lcom/google/firebase/storage/k$b;->b(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-virtual {p0, v0}, Lcom/google/firebase/storage/k$b;->e(Ljava/lang/String;)Lcom/google/firebase/storage/k$b;

    :cond_3
    const-string v0, "contentEncoding"

    invoke-direct {p0, p1, v0}, Lcom/google/firebase/storage/k$b;->b(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_4

    invoke-virtual {p0, v0}, Lcom/google/firebase/storage/k$b;->f(Ljava/lang/String;)Lcom/google/firebase/storage/k$b;

    :cond_4
    const-string v0, "contentLanguage"

    invoke-direct {p0, p1, v0}, Lcom/google/firebase/storage/k$b;->b(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_5

    invoke-virtual {p0, p1}, Lcom/google/firebase/storage/k$b;->g(Ljava/lang/String;)Lcom/google/firebase/storage/k$b;

    :cond_5
    return-void
.end method


# virtual methods
.method public a()Lcom/google/firebase/storage/k;
    .locals 4

    new-instance v0, Lcom/google/firebase/storage/k;

    iget-object v1, p0, Lcom/google/firebase/storage/k$b;->a:Lcom/google/firebase/storage/k;

    iget-boolean v2, p0, Lcom/google/firebase/storage/k$b;->b:Z

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Lcom/google/firebase/storage/k;-><init>(Lcom/google/firebase/storage/k;ZLcom/google/firebase/storage/k$a;)V

    return-object v0
.end method

.method public d(Ljava/lang/String;)Lcom/google/firebase/storage/k$b;
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/storage/k$b;->a:Lcom/google/firebase/storage/k;

    invoke-static {p1}, Lcom/google/firebase/storage/k$c;->d(Ljava/lang/Object;)Lcom/google/firebase/storage/k$c;

    move-result-object p1

    invoke-static {v0, p1}, Lcom/google/firebase/storage/k;->e(Lcom/google/firebase/storage/k;Lcom/google/firebase/storage/k$c;)Lcom/google/firebase/storage/k$c;

    return-object p0
.end method

.method public e(Ljava/lang/String;)Lcom/google/firebase/storage/k$b;
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/storage/k$b;->a:Lcom/google/firebase/storage/k;

    invoke-static {p1}, Lcom/google/firebase/storage/k$c;->d(Ljava/lang/Object;)Lcom/google/firebase/storage/k$c;

    move-result-object p1

    invoke-static {v0, p1}, Lcom/google/firebase/storage/k;->d(Lcom/google/firebase/storage/k;Lcom/google/firebase/storage/k$c;)Lcom/google/firebase/storage/k$c;

    return-object p0
.end method

.method public f(Ljava/lang/String;)Lcom/google/firebase/storage/k$b;
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/storage/k$b;->a:Lcom/google/firebase/storage/k;

    invoke-static {p1}, Lcom/google/firebase/storage/k$c;->d(Ljava/lang/Object;)Lcom/google/firebase/storage/k$c;

    move-result-object p1

    invoke-static {v0, p1}, Lcom/google/firebase/storage/k;->c(Lcom/google/firebase/storage/k;Lcom/google/firebase/storage/k$c;)Lcom/google/firebase/storage/k$c;

    return-object p0
.end method

.method public g(Ljava/lang/String;)Lcom/google/firebase/storage/k$b;
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/storage/k$b;->a:Lcom/google/firebase/storage/k;

    invoke-static {p1}, Lcom/google/firebase/storage/k$c;->d(Ljava/lang/Object;)Lcom/google/firebase/storage/k$c;

    move-result-object p1

    invoke-static {v0, p1}, Lcom/google/firebase/storage/k;->a(Lcom/google/firebase/storage/k;Lcom/google/firebase/storage/k$c;)Lcom/google/firebase/storage/k$c;

    return-object p0
.end method

.method public h(Ljava/lang/String;)Lcom/google/firebase/storage/k$b;
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/storage/k$b;->a:Lcom/google/firebase/storage/k;

    invoke-static {p1}, Lcom/google/firebase/storage/k$c;->d(Ljava/lang/Object;)Lcom/google/firebase/storage/k$c;

    move-result-object p1

    invoke-static {v0, p1}, Lcom/google/firebase/storage/k;->h(Lcom/google/firebase/storage/k;Lcom/google/firebase/storage/k$c;)Lcom/google/firebase/storage/k$c;

    return-object p0
.end method

.method public i(Ljava/lang/String;Ljava/lang/String;)Lcom/google/firebase/storage/k$b;
    .locals 2

    iget-object v0, p0, Lcom/google/firebase/storage/k$b;->a:Lcom/google/firebase/storage/k;

    invoke-static {v0}, Lcom/google/firebase/storage/k;->f(Lcom/google/firebase/storage/k;)Lcom/google/firebase/storage/k$c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/firebase/storage/k$c;->b()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/firebase/storage/k$b;->a:Lcom/google/firebase/storage/k;

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    invoke-static {v1}, Lcom/google/firebase/storage/k$c;->d(Ljava/lang/Object;)Lcom/google/firebase/storage/k$c;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/google/firebase/storage/k;->g(Lcom/google/firebase/storage/k;Lcom/google/firebase/storage/k$c;)Lcom/google/firebase/storage/k$c;

    :cond_0
    iget-object v0, p0, Lcom/google/firebase/storage/k$b;->a:Lcom/google/firebase/storage/k;

    invoke-static {v0}, Lcom/google/firebase/storage/k;->f(Lcom/google/firebase/storage/k;)Lcom/google/firebase/storage/k$c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/firebase/storage/k$c;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object p0
.end method
