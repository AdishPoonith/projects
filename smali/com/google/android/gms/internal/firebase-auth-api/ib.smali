.class final Lcom/google/android/gms/internal/firebase-auth-api/ib;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ljava/nio/charset/Charset;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "UTF-8"

    invoke-static {v0}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/firebase-auth-api/ib;->a:Ljava/nio/charset/Charset;

    return-void
.end method

.method public static a(Lcom/google/android/gms/internal/firebase-auth-api/js;)Lcom/google/android/gms/internal/firebase-auth-api/os;
    .locals 4

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/os;->C()Lcom/google/android/gms/internal/firebase-auth-api/ls;

    move-result-object v0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/firebase-auth-api/js;->D()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/ls;->s(I)Lcom/google/android/gms/internal/firebase-auth-api/ls;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/firebase-auth-api/js;->J()Ljava/util/List;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/firebase-auth-api/is;

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/ns;->D()Lcom/google/android/gms/internal/firebase-auth-api/ms;

    move-result-object v2

    invoke-virtual {v1}, Lcom/google/android/gms/internal/firebase-auth-api/is;->D()Lcom/google/android/gms/internal/firebase-auth-api/vr;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/android/gms/internal/firebase-auth-api/vr;->H()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/firebase-auth-api/ms;->t(Ljava/lang/String;)Lcom/google/android/gms/internal/firebase-auth-api/ms;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/firebase-auth-api/is;->L()I

    move-result v3

    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/firebase-auth-api/ms;->u(I)Lcom/google/android/gms/internal/firebase-auth-api/ms;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/firebase-auth-api/is;->G()Lcom/google/android/gms/internal/firebase-auth-api/ct;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/firebase-auth-api/ms;->s(Lcom/google/android/gms/internal/firebase-auth-api/ct;)Lcom/google/android/gms/internal/firebase-auth-api/ms;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/firebase-auth-api/is;->C()I

    move-result v1

    invoke-virtual {v2, v1}, Lcom/google/android/gms/internal/firebase-auth-api/ms;->r(I)Lcom/google/android/gms/internal/firebase-auth-api/ms;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/firebase-auth-api/o5;->j()Lcom/google/android/gms/internal/firebase-auth-api/r5;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/firebase-auth-api/ns;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/ls;->r(Lcom/google/android/gms/internal/firebase-auth-api/ns;)Lcom/google/android/gms/internal/firebase-auth-api/ls;

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/o5;->j()Lcom/google/android/gms/internal/firebase-auth-api/r5;

    move-result-object p0

    check-cast p0, Lcom/google/android/gms/internal/firebase-auth-api/os;

    return-object p0
.end method
