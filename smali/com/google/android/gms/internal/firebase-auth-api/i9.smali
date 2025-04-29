.class final Lcom/google/android/gms/internal/firebase-auth-api/i9;
.super Lcom/google/android/gms/internal/firebase-auth-api/e9;
.source "SourceFile"


# instance fields
.field private final transient l:Lcom/google/android/gms/internal/firebase-auth-api/d9;

.field private final transient m:[Ljava/lang/Object;

.field private final transient n:I


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/firebase-auth-api/d9;[Ljava/lang/Object;II)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/firebase-auth-api/e9;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/i9;->l:Lcom/google/android/gms/internal/firebase-auth-api/d9;

    iput-object p2, p0, Lcom/google/android/gms/internal/firebase-auth-api/i9;->m:[Ljava/lang/Object;

    iput p4, p0, Lcom/google/android/gms/internal/firebase-auth-api/i9;->n:I

    return-void
.end method

.method static bridge synthetic q(Lcom/google/android/gms/internal/firebase-auth-api/i9;)I
    .locals 0

    iget p0, p0, Lcom/google/android/gms/internal/firebase-auth-api/i9;->n:I

    return p0
.end method

.method static bridge synthetic r(Lcom/google/android/gms/internal/firebase-auth-api/i9;)[Ljava/lang/Object;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/firebase-auth-api/i9;->m:[Ljava/lang/Object;

    return-object p0
.end method


# virtual methods
.method final b([Ljava/lang/Object;I)I
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/firebase-auth-api/e9;->m()Lcom/google/android/gms/internal/firebase-auth-api/a9;

    move-result-object p2

    const/4 v0, 0x0

    invoke-virtual {p2, p1, v0}, Lcom/google/android/gms/internal/firebase-auth-api/h7;->b([Ljava/lang/Object;I)I

    move-result p1

    return p1
.end method

.method public final contains(Ljava/lang/Object;)Z
    .locals 3

    instance-of v0, p1, Ljava/util/Map$Entry;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    check-cast p1, Ljava/util/Map$Entry;

    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object v2, p0, Lcom/google/android/gms/internal/firebase-auth-api/i9;->l:Lcom/google/android/gms/internal/firebase-auth-api/d9;

    invoke-virtual {v2, v0}, Lcom/google/android/gms/internal/firebase-auth-api/d9;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    return v1
.end method

.method public final synthetic iterator()Ljava/util/Iterator;
    .locals 2

    invoke-virtual {p0}, Lcom/google/android/gms/internal/firebase-auth-api/e9;->m()Lcom/google/android/gms/internal/firebase-auth-api/a9;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/a9;->t(I)Lcom/google/android/gms/internal/firebase-auth-api/p9;

    move-result-object v0

    return-object v0
.end method

.method final p()Lcom/google/android/gms/internal/firebase-auth-api/a9;
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/h9;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/firebase-auth-api/h9;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/i9;)V

    return-object v0
.end method

.method public final size()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/i9;->n:I

    return v0
.end method
