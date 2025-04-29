.class final Lcom/google/android/gms/internal/firebase-auth-api/iu;
.super Lcom/google/android/gms/internal/firebase-auth-api/jy;
.source "SourceFile"


# instance fields
.field final synthetic p:Lcom/google/android/gms/internal/firebase-auth-api/jv;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/firebase-auth-api/jv;Lcom/google/android/gms/internal/firebase-auth-api/c0;Ljava/lang/CharSequence;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/iu;->p:Lcom/google/android/gms/internal/firebase-auth-api/jv;

    invoke-direct {p0, p2, p3}, Lcom/google/android/gms/internal/firebase-auth-api/jy;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/c0;Ljava/lang/CharSequence;)V

    return-void
.end method


# virtual methods
.method final d(I)I
    .locals 0

    add-int/lit8 p1, p1, 0x1

    return p1
.end method

.method final e(I)I
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/iu;->p:Lcom/google/android/gms/internal/firebase-auth-api/jv;

    iget-object v0, v0, Lcom/google/android/gms/internal/firebase-auth-api/jv;->a:Lcom/google/android/gms/internal/firebase-auth-api/wh;

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/jy;->l:Ljava/lang/CharSequence;

    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v2

    const-string v3, "index"

    invoke-static {p1, v2, v3}, Lcom/google/android/gms/internal/firebase-auth-api/ht;->b(IILjava/lang/String;)I

    :goto_0
    if-ge p1, v2, :cond_1

    invoke-interface {v1, p1}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v3

    invoke-virtual {v0, v3}, Lcom/google/android/gms/internal/firebase-auth-api/wh;->a(C)Z

    move-result v3

    if-eqz v3, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, -0x1

    :goto_1
    return p1
.end method
