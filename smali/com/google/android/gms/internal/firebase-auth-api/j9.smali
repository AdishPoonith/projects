.class final Lcom/google/android/gms/internal/firebase-auth-api/j9;
.super Lcom/google/android/gms/internal/firebase-auth-api/e9;
.source "SourceFile"


# instance fields
.field private final transient l:Lcom/google/android/gms/internal/firebase-auth-api/d9;

.field private final transient m:Lcom/google/android/gms/internal/firebase-auth-api/a9;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/firebase-auth-api/d9;Lcom/google/android/gms/internal/firebase-auth-api/a9;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/firebase-auth-api/e9;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/j9;->l:Lcom/google/android/gms/internal/firebase-auth-api/d9;

    iput-object p2, p0, Lcom/google/android/gms/internal/firebase-auth-api/j9;->m:Lcom/google/android/gms/internal/firebase-auth-api/a9;

    return-void
.end method


# virtual methods
.method final b([Ljava/lang/Object;I)I
    .locals 1

    iget-object p2, p0, Lcom/google/android/gms/internal/firebase-auth-api/j9;->m:Lcom/google/android/gms/internal/firebase-auth-api/a9;

    const/4 v0, 0x0

    invoke-virtual {p2, p1, v0}, Lcom/google/android/gms/internal/firebase-auth-api/h7;->b([Ljava/lang/Object;I)I

    move-result p1

    return p1
.end method

.method public final contains(Ljava/lang/Object;)Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/j9;->l:Lcom/google/android/gms/internal/firebase-auth-api/d9;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/d9;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final synthetic iterator()Ljava/util/Iterator;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/j9;->m:Lcom/google/android/gms/internal/firebase-auth-api/a9;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/a9;->t(I)Lcom/google/android/gms/internal/firebase-auth-api/p9;

    move-result-object v0

    return-object v0
.end method

.method public final size()I
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/j9;->l:Lcom/google/android/gms/internal/firebase-auth-api/d9;

    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v0

    return v0
.end method
