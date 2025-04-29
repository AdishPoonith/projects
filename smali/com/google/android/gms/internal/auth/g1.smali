.class final Lcom/google/android/gms/internal/auth/g1;
.super Lcom/google/android/gms/internal/auth/i1;
.source "SourceFile"


# instance fields
.field private j:I

.field private final k:I

.field final synthetic l:Lcom/google/android/gms/internal/auth/q1;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/auth/q1;)V
    .locals 1

    iput-object p1, p0, Lcom/google/android/gms/internal/auth/g1;->l:Lcom/google/android/gms/internal/auth/q1;

    invoke-direct {p0}, Lcom/google/android/gms/internal/auth/i1;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lcom/google/android/gms/internal/auth/g1;->j:I

    invoke-virtual {p1}, Lcom/google/android/gms/internal/auth/q1;->k()I

    move-result p1

    iput p1, p0, Lcom/google/android/gms/internal/auth/g1;->k:I

    return-void
.end method


# virtual methods
.method public final hasNext()Z
    .locals 2

    iget v0, p0, Lcom/google/android/gms/internal/auth/g1;->j:I

    iget v1, p0, Lcom/google/android/gms/internal/auth/g1;->k:I

    if-ge v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final zza()B
    .locals 2

    iget v0, p0, Lcom/google/android/gms/internal/auth/g1;->j:I

    iget v1, p0, Lcom/google/android/gms/internal/auth/g1;->k:I

    if-ge v0, v1, :cond_0

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Lcom/google/android/gms/internal/auth/g1;->j:I

    iget-object v1, p0, Lcom/google/android/gms/internal/auth/g1;->l:Lcom/google/android/gms/internal/auth/q1;

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/auth/q1;->e(I)B

    move-result v0

    return v0

    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method
