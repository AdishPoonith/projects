.class public final La6/h;
.super Lcom/google/firebase/auth/k0;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "La6/h;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final j:Ljava/util/List;

.field private final k:La6/j;

.field private final l:Ljava/lang/String;

.field private final m:Lcom/google/firebase/auth/a2;

.field private final n:La6/w1;

.field private final o:Ljava/util/List;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, La6/i;

    invoke-direct {v0}, La6/i;-><init>()V

    sput-object v0, La6/h;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Ljava/util/List;La6/j;Ljava/lang/String;Lcom/google/firebase/auth/a2;La6/w1;Ljava/util/List;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/firebase/auth/k0;-><init>()V

    invoke-static {p1}, Lc4/s;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    iput-object p1, p0, La6/h;->j:Ljava/util/List;

    invoke-static {p2}, Lc4/s;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, La6/j;

    iput-object p1, p0, La6/h;->k:La6/j;

    invoke-static {p3}, Lc4/s;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, La6/h;->l:Ljava/lang/String;

    iput-object p4, p0, La6/h;->m:Lcom/google/firebase/auth/a2;

    iput-object p5, p0, La6/h;->n:La6/w1;

    invoke-static {p6}, Lc4/s;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    iput-object p1, p0, La6/h;->o:Ljava/util/List;

    return-void
.end method

.method static bridge synthetic E(La6/h;)Lcom/google/firebase/auth/a2;
    .locals 0

    iget-object p0, p0, La6/h;->m:Lcom/google/firebase/auth/a2;

    return-object p0
.end method


# virtual methods
.method public final B()Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/google/firebase/auth/j0;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iget-object v1, p0, La6/h;->j:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/firebase/auth/t0;

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    iget-object v1, p0, La6/h;->o:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/firebase/auth/t1;

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    return-object v0
.end method

.method public final C()Lcom/google/firebase/auth/l0;
    .locals 1

    iget-object v0, p0, La6/h;->k:La6/j;

    return-object v0
.end method

.method public final D(Lcom/google/firebase/auth/i0;)Lcom/google/android/gms/tasks/Task;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/firebase/auth/i0;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "Lcom/google/firebase/auth/i;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, La6/h;->l:Ljava/lang/String;

    invoke-static {v0}, Lw5/f;->p(Ljava/lang/String;)Lw5/f;

    move-result-object v0

    invoke-static {v0}, Lcom/google/firebase/auth/FirebaseAuth;->getInstance(Lw5/f;)Lcom/google/firebase/auth/FirebaseAuth;

    move-result-object v0

    iget-object v1, p0, La6/h;->k:La6/j;

    iget-object v2, p0, La6/h;->n:La6/w1;

    invoke-virtual {v0, p1, v1, v2}, Lcom/google/firebase/auth/FirebaseAuth;->q0(Lcom/google/firebase/auth/i0;La6/j;Lcom/google/firebase/auth/a0;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    new-instance v0, La6/g;

    invoke-direct {v0, p0}, La6/g;-><init>(La6/h;)V

    invoke-virtual {p1, v0}, Lcom/google/android/gms/tasks/Task;->continueWithTask(Lcom/google/android/gms/tasks/Continuation;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 4

    invoke-static {p1}, Ld4/c;->a(Landroid/os/Parcel;)I

    move-result v0

    iget-object v1, p0, La6/h;->j:Ljava/util/List;

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {p1, v2, v1, v3}, Ld4/c;->v(Landroid/os/Parcel;ILjava/util/List;Z)V

    iget-object v1, p0, La6/h;->k:La6/j;

    const/4 v2, 0x2

    invoke-static {p1, v2, v1, p2, v3}, Ld4/c;->r(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    iget-object v1, p0, La6/h;->l:Ljava/lang/String;

    const/4 v2, 0x3

    invoke-static {p1, v2, v1, v3}, Ld4/c;->s(Landroid/os/Parcel;ILjava/lang/String;Z)V

    iget-object v1, p0, La6/h;->m:Lcom/google/firebase/auth/a2;

    const/4 v2, 0x4

    invoke-static {p1, v2, v1, p2, v3}, Ld4/c;->r(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    iget-object v1, p0, La6/h;->n:La6/w1;

    const/4 v2, 0x5

    invoke-static {p1, v2, v1, p2, v3}, Ld4/c;->r(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    iget-object p2, p0, La6/h;->o:Ljava/util/List;

    const/4 v1, 0x6

    invoke-static {p1, v1, p2, v3}, Ld4/c;->v(Landroid/os/Parcel;ILjava/util/List;Z)V

    invoke-static {p1, v0}, Ld4/c;->b(Landroid/os/Parcel;I)V

    return-void
.end method
