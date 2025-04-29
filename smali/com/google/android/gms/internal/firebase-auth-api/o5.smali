.class public Lcom/google/android/gms/internal/firebase-auth-api/o5;
.super Lcom/google/android/gms/internal/firebase-auth-api/u3;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<MessageType:",
        "Lcom/google/android/gms/internal/firebase-auth-api/r5<",
        "TMessageType;TBuilderType;>;BuilderType:",
        "Lcom/google/android/gms/internal/firebase-auth-api/o5<",
        "TMessageType;TBuilderType;>;>",
        "Lcom/google/android/gms/internal/firebase-auth-api/u3<",
        "TMessageType;TBuilderType;>;"
    }
.end annotation


# instance fields
.field private final j:Lcom/google/android/gms/internal/firebase-auth-api/r5;

.field protected k:Lcom/google/android/gms/internal/firebase-auth-api/r5;


# direct methods
.method protected constructor <init>(Lcom/google/android/gms/internal/firebase-auth-api/r5;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TMessageType;)V"
        }
    .end annotation

    invoke-direct {p0}, Lcom/google/android/gms/internal/firebase-auth-api/u3;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/o5;->j:Lcom/google/android/gms/internal/firebase-auth-api/r5;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/r5;->p()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/r5;->y()Lcom/google/android/gms/internal/firebase-auth-api/r5;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/o5;->k:Lcom/google/android/gms/internal/firebase-auth-api/r5;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Default instance must be immutable."

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private static g(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 2

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/e7;->a()Lcom/google/android/gms/internal/firebase-auth-api/e7;

    move-result-object v0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/e7;->b(Ljava/lang/Class;)Lcom/google/android/gms/internal/firebase-auth-api/j7;

    move-result-object v0

    invoke-interface {v0, p0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/j7;->zzg(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final bridge synthetic clone()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/firebase-auth-api/o5;->h()Lcom/google/android/gms/internal/firebase-auth-api/o5;

    move-result-object v0

    return-object v0
.end method

.method public final h()Lcom/google/android/gms/internal/firebase-auth-api/o5;
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/o5;->j:Lcom/google/android/gms/internal/firebase-auth-api/r5;

    const/4 v1, 0x5

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2, v2}, Lcom/google/android/gms/internal/firebase-auth-api/r5;->t(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/firebase-auth-api/o5;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/firebase-auth-api/o5;->n()Lcom/google/android/gms/internal/firebase-auth-api/r5;

    move-result-object v1

    iput-object v1, v0, Lcom/google/android/gms/internal/firebase-auth-api/o5;->k:Lcom/google/android/gms/internal/firebase-auth-api/r5;

    return-object v0
.end method

.method public final i(Lcom/google/android/gms/internal/firebase-auth-api/r5;)Lcom/google/android/gms/internal/firebase-auth-api/o5;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/o5;->j:Lcom/google/android/gms/internal/firebase-auth-api/r5;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/r5;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/o5;->k:Lcom/google/android/gms/internal/firebase-auth-api/r5;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/r5;->p()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/firebase-auth-api/o5;->p()V

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/o5;->k:Lcom/google/android/gms/internal/firebase-auth-api/r5;

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/o5;->g(Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_1
    return-object p0
.end method

.method public final j()Lcom/google/android/gms/internal/firebase-auth-api/r5;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TMessageType;"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/google/android/gms/internal/firebase-auth-api/o5;->n()Lcom/google/android/gms/internal/firebase-auth-api/r5;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/r5;->o()Z

    move-result v1

    if-eqz v1, :cond_0

    return-object v0

    :cond_0
    new-instance v1, Lcom/google/android/gms/internal/firebase-auth-api/c8;

    invoke-direct {v1, v0}, Lcom/google/android/gms/internal/firebase-auth-api/c8;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/w6;)V

    throw v1
.end method

.method public n()Lcom/google/android/gms/internal/firebase-auth-api/r5;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TMessageType;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/o5;->k:Lcom/google/android/gms/internal/firebase-auth-api/r5;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/r5;->p()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/o5;->k:Lcom/google/android/gms/internal/firebase-auth-api/r5;

    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/o5;->k:Lcom/google/android/gms/internal/firebase-auth-api/r5;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/r5;->k()V

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/o5;->k:Lcom/google/android/gms/internal/firebase-auth-api/r5;

    return-object v0
.end method

.method protected final o()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/o5;->k:Lcom/google/android/gms/internal/firebase-auth-api/r5;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/r5;->p()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/firebase-auth-api/o5;->p()V

    :cond_0
    return-void
.end method

.method protected p()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/o5;->j:Lcom/google/android/gms/internal/firebase-auth-api/r5;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/r5;->y()Lcom/google/android/gms/internal/firebase-auth-api/r5;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/o5;->k:Lcom/google/android/gms/internal/firebase-auth-api/r5;

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/o5;->g(Ljava/lang/Object;Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/o5;->k:Lcom/google/android/gms/internal/firebase-auth-api/r5;

    return-void
.end method

.method public bridge synthetic zzk()Lcom/google/android/gms/internal/firebase-auth-api/w6;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/firebase-auth-api/o5;->n()Lcom/google/android/gms/internal/firebase-auth-api/r5;

    move-result-object v0

    return-object v0
.end method
