.class public final La6/w1;
.super Lcom/google/firebase/auth/a0;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "La6/w1;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private j:Lcom/google/android/gms/internal/firebase-auth-api/j2;

.field private k:La6/s1;

.field private final l:Ljava/lang/String;

.field private m:Ljava/lang/String;

.field private n:Ljava/util/List;

.field private o:Ljava/util/List;

.field private p:Ljava/lang/String;

.field private q:Ljava/lang/Boolean;

.field private r:La6/y1;

.field private s:Z

.field private t:Lcom/google/firebase/auth/a2;

.field private u:La6/h0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, La6/x1;

    invoke-direct {v0}, La6/x1;-><init>()V

    sput-object v0, La6/w1;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(Lcom/google/android/gms/internal/firebase-auth-api/j2;La6/s1;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/Boolean;La6/y1;ZLcom/google/firebase/auth/a2;La6/h0;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/firebase/auth/a0;-><init>()V

    iput-object p1, p0, La6/w1;->j:Lcom/google/android/gms/internal/firebase-auth-api/j2;

    iput-object p2, p0, La6/w1;->k:La6/s1;

    iput-object p3, p0, La6/w1;->l:Ljava/lang/String;

    iput-object p4, p0, La6/w1;->m:Ljava/lang/String;

    iput-object p5, p0, La6/w1;->n:Ljava/util/List;

    iput-object p6, p0, La6/w1;->o:Ljava/util/List;

    iput-object p7, p0, La6/w1;->p:Ljava/lang/String;

    iput-object p8, p0, La6/w1;->q:Ljava/lang/Boolean;

    iput-object p9, p0, La6/w1;->r:La6/y1;

    iput-boolean p10, p0, La6/w1;->s:Z

    iput-object p11, p0, La6/w1;->t:Lcom/google/firebase/auth/a2;

    iput-object p12, p0, La6/w1;->u:La6/h0;

    return-void
.end method

.method public constructor <init>(Lw5/f;Ljava/util/List;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/firebase/auth/a0;-><init>()V

    invoke-static {p1}, Lc4/s;->j(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1}, Lw5/f;->q()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, La6/w1;->l:Ljava/lang/String;

    const-string p1, "com.google.firebase.auth.internal.DefaultFirebaseUser"

    iput-object p1, p0, La6/w1;->m:Ljava/lang/String;

    const-string p1, "2"

    iput-object p1, p0, La6/w1;->p:Ljava/lang/String;

    invoke-virtual {p0, p2}, La6/w1;->Y(Ljava/util/List;)Lcom/google/firebase/auth/a0;

    return-void
.end method


# virtual methods
.method public final D()Lcom/google/firebase/auth/b0;
    .locals 1

    iget-object v0, p0, La6/w1;->r:La6/y1;

    return-object v0
.end method

.method public final synthetic E()Lcom/google/firebase/auth/h0;
    .locals 1

    new-instance v0, La6/f;

    invoke-direct {v0, p0}, La6/f;-><init>(La6/w1;)V

    return-object v0
.end method

.method public final F()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "+",
            "Lcom/google/firebase/auth/y0;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, La6/w1;->n:Ljava/util/List;

    return-object v0
.end method

.method public final G()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, La6/w1;->j:Lcom/google/android/gms/internal/firebase-auth-api/j2;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/j2;->E()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/j2;->E()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, La6/e0;->a(Ljava/lang/String;)Lcom/google/firebase/auth/c0;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/firebase/auth/c0;->b()Ljava/util/Map;

    move-result-object v0

    const-string v2, "firebase"

    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    if-eqz v0, :cond_0

    const-string v1, "tenant"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0

    :cond_0
    return-object v1
.end method

.method public final H()Z
    .locals 4

    iget-object v0, p0, La6/w1;->q:Ljava/lang/Boolean;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_4

    :cond_0
    iget-object v0, p0, La6/w1;->j:Lcom/google/android/gms/internal/firebase-auth-api/j2;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/j2;->E()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, La6/e0;->a(Ljava/lang/String;)Lcom/google/firebase/auth/c0;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/firebase/auth/c0;->e()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_1
    const-string v0, ""

    :goto_0
    iget-object v1, p0, La6/w1;->n:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-gt v1, v3, :cond_3

    if-eqz v0, :cond_2

    const-string v1, "custom"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    :cond_2
    const/4 v2, 0x1

    :cond_3
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p0, La6/w1;->q:Ljava/lang/Boolean;

    :cond_4
    iget-object v0, p0, La6/w1;->q:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public final W()Lw5/f;
    .locals 1

    iget-object v0, p0, La6/w1;->l:Ljava/lang/String;

    invoke-static {v0}, Lw5/f;->p(Ljava/lang/String;)Lw5/f;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic X()Lcom/google/firebase/auth/a0;
    .locals 0

    invoke-virtual {p0}, La6/w1;->h0()La6/w1;

    return-object p0
.end method

.method public final declared-synchronized Y(Ljava/util/List;)Lcom/google/firebase/auth/a0;
    .locals 5

    monitor-enter p0

    :try_start_0
    invoke-static {p1}, Lc4/s;->j(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Ljava/util/ArrayList;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v0, p0, La6/w1;->n:Ljava/util/List;

    new-instance v0, Ljava/util/ArrayList;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v0, p0, La6/w1;->o:Ljava/util/List;

    const/4 v0, 0x0

    const/4 v1, 0x0

    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v2

    if-ge v1, v2, :cond_1

    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/firebase/auth/y0;

    invoke-interface {v2}, Lcom/google/firebase/auth/y0;->g()Ljava/lang/String;

    move-result-object v3

    const-string v4, "firebase"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    move-object v3, v2

    check-cast v3, La6/s1;

    iput-object v3, p0, La6/w1;->k:La6/s1;

    goto :goto_1

    :cond_0
    iget-object v3, p0, La6/w1;->o:Ljava/util/List;

    invoke-interface {v2}, Lcom/google/firebase/auth/y0;->g()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v3, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_1
    iget-object v3, p0, La6/w1;->n:Ljava/util/List;

    check-cast v2, La6/s1;

    invoke-interface {v3, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    iget-object p1, p0, La6/w1;->k:La6/s1;

    if-nez p1, :cond_2

    iget-object p1, p0, La6/w1;->n:Ljava/util/List;

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, La6/s1;

    iput-object p1, p0, La6/w1;->k:La6/s1;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_2
    monitor-exit p0

    return-object p0

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final Z()Lcom/google/android/gms/internal/firebase-auth-api/j2;
    .locals 1

    iget-object v0, p0, La6/w1;->j:Lcom/google/android/gms/internal/firebase-auth-api/j2;

    return-object v0
.end method

.method public final a()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, La6/w1;->k:La6/s1;

    invoke-virtual {v0}, La6/s1;->a()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final a0()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, La6/w1;->j:Lcom/google/android/gms/internal/firebase-auth-api/j2;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/j2;->E()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final b0()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, La6/w1;->j:Lcom/google/android/gms/internal/firebase-auth-api/j2;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/j2;->H()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final c()Landroid/net/Uri;
    .locals 1

    iget-object v0, p0, La6/w1;->k:La6/s1;

    invoke-virtual {v0}, La6/s1;->c()Landroid/net/Uri;

    move-result-object v0

    return-object v0
.end method

.method public final c0()Ljava/util/List;
    .locals 1

    iget-object v0, p0, La6/w1;->o:Ljava/util/List;

    return-object v0
.end method

.method public final d0(Lcom/google/android/gms/internal/firebase-auth-api/j2;)V
    .locals 0

    invoke-static {p1}, Lc4/s;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/firebase-auth-api/j2;

    iput-object p1, p0, La6/w1;->j:Lcom/google/android/gms/internal/firebase-auth-api/j2;

    return-void
.end method

.method public final e0(Ljava/util/List;)V
    .locals 4

    sget-object v0, La6/h0;->CREATOR:Landroid/os/Parcelable$Creator;

    const/4 v0, 0x0

    if-eqz p1, :cond_4

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_1

    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/firebase/auth/j0;

    instance-of v3, v2, Lcom/google/firebase/auth/t0;

    if-eqz v3, :cond_2

    check-cast v2, Lcom/google/firebase/auth/t0;

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    instance-of v3, v2, Lcom/google/firebase/auth/t1;

    if-eqz v3, :cond_1

    check-cast v2, Lcom/google/firebase/auth/t1;

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_3
    new-instance p1, La6/h0;

    invoke-direct {p1, v0, v1}, La6/h0;-><init>(Ljava/util/List;Ljava/util/List;)V

    move-object v0, p1

    :cond_4
    :goto_1
    iput-object v0, p0, La6/w1;->u:La6/h0;

    return-void
.end method

.method public final f()Z
    .locals 1

    iget-object v0, p0, La6/w1;->k:La6/s1;

    invoke-virtual {v0}, La6/s1;->f()Z

    move-result v0

    return v0
.end method

.method public final f0()Lcom/google/firebase/auth/a2;
    .locals 1

    iget-object v0, p0, La6/w1;->t:Lcom/google/firebase/auth/a2;

    return-object v0
.end method

.method public final g()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, La6/w1;->k:La6/s1;

    invoke-virtual {v0}, La6/s1;->g()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final g0(Ljava/lang/String;)La6/w1;
    .locals 0

    iput-object p1, p0, La6/w1;->p:Ljava/lang/String;

    return-object p0
.end method

.method public final h0()La6/w1;
    .locals 1

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v0, p0, La6/w1;->q:Ljava/lang/Boolean;

    return-object p0
.end method

.method public final i0()Ljava/util/List;
    .locals 1

    iget-object v0, p0, La6/w1;->u:La6/h0;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, La6/h0;->B()Ljava/util/List;

    move-result-object v0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    :goto_0
    return-object v0
.end method

.method public final j()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, La6/w1;->k:La6/s1;

    invoke-virtual {v0}, La6/s1;->j()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final j0()Ljava/util/List;
    .locals 1

    iget-object v0, p0, La6/w1;->n:Ljava/util/List;

    return-object v0
.end method

.method public final k0(Lcom/google/firebase/auth/a2;)V
    .locals 0

    iput-object p1, p0, La6/w1;->t:Lcom/google/firebase/auth/a2;

    return-void
.end method

.method public final l0(Z)V
    .locals 0

    iput-boolean p1, p0, La6/w1;->s:Z

    return-void
.end method

.method public final m0(La6/y1;)V
    .locals 0

    iput-object p1, p0, La6/w1;->r:La6/y1;

    return-void
.end method

.method public final n0()Z
    .locals 1

    iget-boolean v0, p0, La6/w1;->s:Z

    return v0
.end method

.method public final s()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, La6/w1;->k:La6/s1;

    invoke-virtual {v0}, La6/s1;->s()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 4

    invoke-static {p1}, Ld4/c;->a(Landroid/os/Parcel;)I

    move-result v0

    iget-object v1, p0, La6/w1;->j:Lcom/google/android/gms/internal/firebase-auth-api/j2;

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {p1, v2, v1, p2, v3}, Ld4/c;->r(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    iget-object v1, p0, La6/w1;->k:La6/s1;

    const/4 v2, 0x2

    invoke-static {p1, v2, v1, p2, v3}, Ld4/c;->r(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    iget-object v1, p0, La6/w1;->l:Ljava/lang/String;

    const/4 v2, 0x3

    invoke-static {p1, v2, v1, v3}, Ld4/c;->s(Landroid/os/Parcel;ILjava/lang/String;Z)V

    iget-object v1, p0, La6/w1;->m:Ljava/lang/String;

    const/4 v2, 0x4

    invoke-static {p1, v2, v1, v3}, Ld4/c;->s(Landroid/os/Parcel;ILjava/lang/String;Z)V

    iget-object v1, p0, La6/w1;->n:Ljava/util/List;

    const/4 v2, 0x5

    invoke-static {p1, v2, v1, v3}, Ld4/c;->v(Landroid/os/Parcel;ILjava/util/List;Z)V

    iget-object v1, p0, La6/w1;->o:Ljava/util/List;

    const/4 v2, 0x6

    invoke-static {p1, v2, v1, v3}, Ld4/c;->t(Landroid/os/Parcel;ILjava/util/List;Z)V

    iget-object v1, p0, La6/w1;->p:Ljava/lang/String;

    const/4 v2, 0x7

    invoke-static {p1, v2, v1, v3}, Ld4/c;->s(Landroid/os/Parcel;ILjava/lang/String;Z)V

    invoke-virtual {p0}, La6/w1;->H()Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    const/16 v2, 0x8

    invoke-static {p1, v2, v1, v3}, Ld4/c;->d(Landroid/os/Parcel;ILjava/lang/Boolean;Z)V

    iget-object v1, p0, La6/w1;->r:La6/y1;

    const/16 v2, 0x9

    invoke-static {p1, v2, v1, p2, v3}, Ld4/c;->r(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    iget-boolean v1, p0, La6/w1;->s:Z

    const/16 v2, 0xa

    invoke-static {p1, v2, v1}, Ld4/c;->c(Landroid/os/Parcel;IZ)V

    iget-object v1, p0, La6/w1;->t:Lcom/google/firebase/auth/a2;

    const/16 v2, 0xb

    invoke-static {p1, v2, v1, p2, v3}, Ld4/c;->r(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    iget-object v1, p0, La6/w1;->u:La6/h0;

    const/16 v2, 0xc

    invoke-static {p1, v2, v1, p2, v3}, Ld4/c;->r(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    invoke-static {p1, v0}, Ld4/c;->b(Landroid/os/Parcel;I)V

    return-void
.end method

.method public final x()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, La6/w1;->k:La6/s1;

    invoke-virtual {v0}, La6/s1;->x()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
