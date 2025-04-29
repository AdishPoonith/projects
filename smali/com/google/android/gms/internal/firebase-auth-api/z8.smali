.class final Lcom/google/android/gms/internal/firebase-auth-api/z8;
.super Lcom/google/android/gms/internal/firebase-auth-api/a9;
.source "SourceFile"


# instance fields
.field final transient m:I

.field final transient n:I

.field final synthetic o:Lcom/google/android/gms/internal/firebase-auth-api/a9;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/firebase-auth-api/a9;II)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/z8;->o:Lcom/google/android/gms/internal/firebase-auth-api/a9;

    invoke-direct {p0}, Lcom/google/android/gms/internal/firebase-auth-api/a9;-><init>()V

    iput p2, p0, Lcom/google/android/gms/internal/firebase-auth-api/z8;->m:I

    iput p3, p0, Lcom/google/android/gms/internal/firebase-auth-api/z8;->n:I

    return-void
.end method


# virtual methods
.method final e()I
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/z8;->o:Lcom/google/android/gms/internal/firebase-auth-api/a9;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/h7;->k()I

    move-result v0

    iget v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/z8;->m:I

    add-int/2addr v0, v1

    iget v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/z8;->n:I

    add-int/2addr v0, v1

    return v0
.end method

.method public final get(I)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/z8;->n:I

    const-string v1, "index"

    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/ht;->a(IILjava/lang/String;)I

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/z8;->o:Lcom/google/android/gms/internal/firebase-auth-api/a9;

    iget v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/z8;->m:I

    add-int/2addr p1, v1

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method final k()I
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/z8;->o:Lcom/google/android/gms/internal/firebase-auth-api/a9;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/h7;->k()I

    move-result v0

    iget v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/z8;->m:I

    add-int/2addr v0, v1

    return v0
.end method

.method final l()[Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/z8;->o:Lcom/google/android/gms/internal/firebase-auth-api/a9;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/h7;->l()[Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final m(II)Lcom/google/android/gms/internal/firebase-auth-api/a9;
    .locals 2

    iget v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/z8;->n:I

    invoke-static {p1, p2, v0}, Lcom/google/android/gms/internal/firebase-auth-api/ht;->c(III)V

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/z8;->o:Lcom/google/android/gms/internal/firebase-auth-api/a9;

    iget v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/z8;->m:I

    add-int/2addr p1, v1

    add-int/2addr p2, v1

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/firebase-auth-api/a9;->m(II)Lcom/google/android/gms/internal/firebase-auth-api/a9;

    move-result-object p1

    return-object p1
.end method

.method public final size()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/z8;->n:I

    return v0
.end method

.method public final bridge synthetic subList(II)Ljava/util/List;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lcom/google/android/gms/internal/firebase-auth-api/a9;->m(II)Lcom/google/android/gms/internal/firebase-auth-api/a9;

    move-result-object p1

    return-object p1
.end method
