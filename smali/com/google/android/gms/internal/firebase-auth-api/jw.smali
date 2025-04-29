.class final Lcom/google/android/gms/internal/firebase-auth-api/jw;
.super Lcom/google/android/gms/internal/firebase-auth-api/jy;
.source "SourceFile"


# instance fields
.field final synthetic p:Lcom/google/android/gms/internal/firebase-auth-api/yj;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/firebase-auth-api/jx;Lcom/google/android/gms/internal/firebase-auth-api/c0;Ljava/lang/CharSequence;Lcom/google/android/gms/internal/firebase-auth-api/yj;)V
    .locals 0

    iput-object p4, p0, Lcom/google/android/gms/internal/firebase-auth-api/jw;->p:Lcom/google/android/gms/internal/firebase-auth-api/yj;

    invoke-direct {p0, p2, p3}, Lcom/google/android/gms/internal/firebase-auth-api/jy;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/c0;Ljava/lang/CharSequence;)V

    return-void
.end method


# virtual methods
.method public final d(I)I
    .locals 0

    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/jw;->p:Lcom/google/android/gms/internal/firebase-auth-api/yj;

    check-cast p1, Lcom/google/android/gms/internal/firebase-auth-api/bn;

    iget-object p1, p1, Lcom/google/android/gms/internal/firebase-auth-api/bn;->a:Ljava/util/regex/Matcher;

    invoke-virtual {p1}, Ljava/util/regex/Matcher;->end()I

    move-result p1

    return p1
.end method

.method public final e(I)I
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/jw;->p:Lcom/google/android/gms/internal/firebase-auth-api/yj;

    check-cast v0, Lcom/google/android/gms/internal/firebase-auth-api/bn;

    iget-object v0, v0, Lcom/google/android/gms/internal/firebase-auth-api/bn;->a:Ljava/util/regex/Matcher;

    invoke-virtual {v0, p1}, Ljava/util/regex/Matcher;->find(I)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/jw;->p:Lcom/google/android/gms/internal/firebase-auth-api/yj;

    check-cast p1, Lcom/google/android/gms/internal/firebase-auth-api/bn;

    iget-object p1, p1, Lcom/google/android/gms/internal/firebase-auth-api/bn;->a:Ljava/util/regex/Matcher;

    invoke-virtual {p1}, Ljava/util/regex/Matcher;->start()I

    move-result p1

    return p1

    :cond_0
    const/4 p1, -0x1

    return p1
.end method
