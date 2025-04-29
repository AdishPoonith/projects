.class public final Lcom/google/android/gms/internal/firebase-auth-api/fs;
.super Lcom/google/android/gms/internal/firebase-auth-api/o5;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/firebase-auth-api/x6;


# direct methods
.method private constructor <init>()V
    .locals 1

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/js;->G()Lcom/google/android/gms/internal/firebase-auth-api/js;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/firebase-auth-api/o5;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/r5;)V

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/internal/firebase-auth-api/es;)V
    .locals 0

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/js;->G()Lcom/google/android/gms/internal/firebase-auth-api/js;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/o5;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/r5;)V

    return-void
.end method


# virtual methods
.method public final r()I
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/o5;->k:Lcom/google/android/gms/internal/firebase-auth-api/r5;

    check-cast v0, Lcom/google/android/gms/internal/firebase-auth-api/js;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/js;->C()I

    move-result v0

    return v0
.end method

.method public final s(Lcom/google/android/gms/internal/firebase-auth-api/is;)Lcom/google/android/gms/internal/firebase-auth-api/fs;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/firebase-auth-api/o5;->o()V

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/o5;->k:Lcom/google/android/gms/internal/firebase-auth-api/r5;

    check-cast v0, Lcom/google/android/gms/internal/firebase-auth-api/js;

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/js;->L(Lcom/google/android/gms/internal/firebase-auth-api/js;Lcom/google/android/gms/internal/firebase-auth-api/is;)V

    return-object p0
.end method

.method public final t(I)Lcom/google/android/gms/internal/firebase-auth-api/fs;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/firebase-auth-api/o5;->o()V

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/o5;->k:Lcom/google/android/gms/internal/firebase-auth-api/r5;

    check-cast v0, Lcom/google/android/gms/internal/firebase-auth-api/js;

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/js;->K(Lcom/google/android/gms/internal/firebase-auth-api/js;I)V

    return-object p0
.end method

.method public final u(I)Lcom/google/android/gms/internal/firebase-auth-api/is;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/o5;->k:Lcom/google/android/gms/internal/firebase-auth-api/r5;

    check-cast v0, Lcom/google/android/gms/internal/firebase-auth-api/js;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/js;->F(I)Lcom/google/android/gms/internal/firebase-auth-api/is;

    move-result-object p1

    return-object p1
.end method

.method public final v()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/o5;->k:Lcom/google/android/gms/internal/firebase-auth-api/r5;

    check-cast v0, Lcom/google/android/gms/internal/firebase-auth-api/js;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/js;->J()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
