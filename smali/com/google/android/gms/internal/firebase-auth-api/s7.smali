.class final Lcom/google/android/gms/internal/firebase-auth-api/s7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Iterator;


# instance fields
.field private j:I

.field private k:Z

.field private l:Ljava/util/Iterator;

.field final synthetic m:Lcom/google/android/gms/internal/firebase-auth-api/w7;


# direct methods
.method synthetic constructor <init>(Lcom/google/android/gms/internal/firebase-auth-api/w7;Lcom/google/android/gms/internal/firebase-auth-api/r7;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/s7;->m:Lcom/google/android/gms/internal/firebase-auth-api/w7;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, -0x1

    iput p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/s7;->j:I

    return-void
.end method

.method private final a()Ljava/util/Iterator;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/s7;->l:Ljava/util/Iterator;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/s7;->m:Lcom/google/android/gms/internal/firebase-auth-api/w7;

    invoke-static {v0}, Lcom/google/android/gms/internal/firebase-auth-api/w7;->h(Lcom/google/android/gms/internal/firebase-auth-api/w7;)Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/s7;->l:Ljava/util/Iterator;

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/s7;->l:Ljava/util/Iterator;

    return-object v0
.end method


# virtual methods
.method public final hasNext()Z
    .locals 4

    iget v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/s7;->j:I

    const/4 v1, 0x1

    add-int/2addr v0, v1

    iget-object v2, p0, Lcom/google/android/gms/internal/firebase-auth-api/s7;->m:Lcom/google/android/gms/internal/firebase-auth-api/w7;

    invoke-static {v2}, Lcom/google/android/gms/internal/firebase-auth-api/w7;->f(Lcom/google/android/gms/internal/firebase-auth-api/w7;)Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    const/4 v3, 0x0

    if-lt v0, v2, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/s7;->m:Lcom/google/android/gms/internal/firebase-auth-api/w7;

    invoke-static {v0}, Lcom/google/android/gms/internal/firebase-auth-api/w7;->h(Lcom/google/android/gms/internal/firebase-auth-api/w7;)Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-direct {p0}, Lcom/google/android/gms/internal/firebase-auth-api/s7;->a()Ljava/util/Iterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    return v3

    :cond_1
    const/4 v1, 0x0

    :cond_2
    :goto_0
    return v1
.end method

.method public final bridge synthetic next()Ljava/lang/Object;
    .locals 2

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/s7;->k:Z

    iget v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/s7;->j:I

    add-int/2addr v1, v0

    iput v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/s7;->j:I

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/s7;->m:Lcom/google/android/gms/internal/firebase-auth-api/w7;

    invoke-static {v0}, Lcom/google/android/gms/internal/firebase-auth-api/w7;->f(Lcom/google/android/gms/internal/firebase-auth-api/w7;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v1, v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/s7;->m:Lcom/google/android/gms/internal/firebase-auth-api/w7;

    invoke-static {v0}, Lcom/google/android/gms/internal/firebase-auth-api/w7;->f(Lcom/google/android/gms/internal/firebase-auth-api/w7;)Ljava/util/List;

    move-result-object v0

    iget v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/s7;->j:I

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    goto :goto_0

    :cond_0
    invoke-direct {p0}, Lcom/google/android/gms/internal/firebase-auth-api/s7;->a()Ljava/util/Iterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    :goto_0
    check-cast v0, Ljava/util/Map$Entry;

    return-object v0
.end method

.method public final remove()V
    .locals 3

    iget-boolean v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/s7;->k:Z

    if-eqz v0, :cond_1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/s7;->k:Z

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/s7;->m:Lcom/google/android/gms/internal/firebase-auth-api/w7;

    invoke-static {v0}, Lcom/google/android/gms/internal/firebase-auth-api/w7;->i(Lcom/google/android/gms/internal/firebase-auth-api/w7;)V

    iget v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/s7;->j:I

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/s7;->m:Lcom/google/android/gms/internal/firebase-auth-api/w7;

    invoke-static {v1}, Lcom/google/android/gms/internal/firebase-auth-api/w7;->f(Lcom/google/android/gms/internal/firebase-auth-api/w7;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/s7;->m:Lcom/google/android/gms/internal/firebase-auth-api/w7;

    iget v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/s7;->j:I

    add-int/lit8 v2, v1, -0x1

    iput v2, p0, Lcom/google/android/gms/internal/firebase-auth-api/s7;->j:I

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/w7;->d(Lcom/google/android/gms/internal/firebase-auth-api/w7;I)Ljava/lang/Object;

    return-void

    :cond_0
    invoke-direct {p0}, Lcom/google/android/gms/internal/firebase-auth-api/s7;->a()Ljava/util/Iterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    return-void

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "remove() was called before next()"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
