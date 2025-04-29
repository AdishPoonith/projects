.class public final Lp1/r;
.super Lp1/k0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lp1/r$b;
    }
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lp1/r;",
            ">;"
        }
    .end annotation
.end field

.field public static final p:Lp1/r$b;


# instance fields
.field private final n:Ljava/lang/String;

.field private final o:Lp0/h;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lp1/r$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lp1/r$b;-><init>(Lkotlin/jvm/internal/g;)V

    sput-object v0, Lp1/r;->p:Lp1/r$b;

    new-instance v0, Lp1/r$a;

    invoke-direct {v0}, Lp1/r$a;-><init>()V

    sput-object v0, Lp1/r;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    const-string v0, "source"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lp1/k0;-><init>(Landroid/os/Parcel;)V

    const-string p1, "instagram_login"

    iput-object p1, p0, Lp1/r;->n:Ljava/lang/String;

    sget-object p1, Lp0/h;->t:Lp0/h;

    iput-object p1, p0, Lp1/r;->o:Lp0/h;

    return-void
.end method

.method public constructor <init>(Lp1/u;)V
    .locals 1

    const-string v0, "loginClient"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lp1/k0;-><init>(Lp1/u;)V

    const-string p1, "instagram_login"

    iput-object p1, p0, Lp1/r;->n:Ljava/lang/String;

    sget-object p1, Lp0/h;->t:Lp0/h;

    iput-object p1, p0, Lp1/r;->o:Lp0/h;

    return-void
.end method


# virtual methods
.method public F()Lp0/h;
    .locals 1

    iget-object v0, p0, Lp1/r;->o:Lp0/h;

    return-object v0
.end method

.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public f()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lp1/r;->n:Ljava/lang/String;

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    const-string v0, "dest"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1, p2}, Lp1/f0;->writeToParcel(Landroid/os/Parcel;I)V

    return-void
.end method

.method public z(Lp1/u$e;)I
    .locals 16

    move-object/from16 v0, p0

    const-string v1, "request"

    move-object/from16 v2, p1

    invoke-static {v2, v1}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Lp1/u;->v:Lp1/u$c;

    invoke-virtual {v1}, Lp1/u$c;->a()Ljava/lang/String;

    move-result-object v15

    sget-object v3, Lf1/e0;->a:Lf1/e0;

    invoke-virtual/range {p0 .. p0}, Lp1/f0;->d()Lp1/u;

    move-result-object v3

    invoke-virtual {v3}, Lp1/u;->l()Landroidx/fragment/app/e;

    move-result-object v3

    if-nez v3, :cond_0

    sget-object v3, Lp0/f0;->a:Lp0/f0;

    invoke-static {}, Lp0/f0;->l()Landroid/content/Context;

    move-result-object v3

    :cond_0
    invoke-virtual/range {p1 .. p1}, Lp1/u$e;->a()Ljava/lang/String;

    move-result-object v4

    invoke-virtual/range {p1 .. p1}, Lp1/u$e;->x()Ljava/util/Set;

    move-result-object v5

    invoke-virtual/range {p1 .. p1}, Lp1/u$e;->E()Z

    move-result v6

    invoke-virtual/range {p1 .. p1}, Lp1/u$e;->B()Z

    move-result v7

    invoke-virtual/range {p1 .. p1}, Lp1/u$e;->j()Lp1/e;

    move-result-object v8

    if-nez v8, :cond_1

    sget-object v8, Lp1/e;->k:Lp1/e;

    :cond_1
    invoke-virtual/range {p1 .. p1}, Lp1/u$e;->b()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v0, v9}, Lp1/f0;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    invoke-virtual/range {p1 .. p1}, Lp1/u$e;->c()Ljava/lang/String;

    move-result-object v10

    invoke-virtual/range {p1 .. p1}, Lp1/u$e;->q()Ljava/lang/String;

    move-result-object v11

    invoke-virtual/range {p1 .. p1}, Lp1/u$e;->z()Z

    move-result v12

    invoke-virtual/range {p1 .. p1}, Lp1/u$e;->C()Z

    move-result v13

    invoke-virtual/range {p1 .. p1}, Lp1/u$e;->L()Z

    move-result v14

    move-object v2, v3

    move-object v3, v4

    move-object v4, v5

    move-object v5, v15

    invoke-static/range {v2 .. v14}, Lf1/e0;->j(Landroid/content/Context;Ljava/lang/String;Ljava/util/Collection;Ljava/lang/String;ZZLp1/e;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZ)Landroid/content/Intent;

    move-result-object v2

    const-string v3, "e2e"

    invoke-virtual {v0, v3, v15}, Lp1/f0;->a(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {v1}, Lp1/u$c;->b()I

    move-result v1

    invoke-virtual {v0, v2, v1}, Lp1/k0;->M(Landroid/content/Intent;I)Z

    move-result v1

    return v1
.end method
