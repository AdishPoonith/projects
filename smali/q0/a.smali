.class public final Lq0/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lq0/a$b;,
        Lq0/a$a;
    }
.end annotation


# static fields
.field public static final l:Lq0/a$a;


# instance fields
.field private final j:Ljava/lang/String;

.field private final k:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lq0/a$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lq0/a$a;-><init>(Lkotlin/jvm/internal/g;)V

    sput-object v0, Lq0/a;->l:Lq0/a$a;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const-string v0, "applicationId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lq0/a;->j:Ljava/lang/String;

    sget-object p2, Lf1/l0;->a:Lf1/l0;

    invoke-static {p1}, Lf1/l0;->X(Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    :cond_0
    iput-object p1, p0, Lq0/a;->k:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Lp0/a;)V
    .locals 1

    const-string v0, "accessToken"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lp0/a;->s()Ljava/lang/String;

    move-result-object p1

    sget-object v0, Lp0/f0;->a:Lp0/f0;

    invoke-static {}, Lp0/f0;->m()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lq0/a;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private final writeReplace()Ljava/lang/Object;
    .locals 3

    new-instance v0, Lq0/a$b;

    iget-object v1, p0, Lq0/a;->k:Ljava/lang/String;

    iget-object v2, p0, Lq0/a;->j:Ljava/lang/String;

    invoke-direct {v0, v1, v2}, Lq0/a$b;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lq0/a;->k:Ljava/lang/String;

    return-object v0
.end method

.method public final b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lq0/a;->j:Ljava/lang/String;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    instance-of v0, p1, Lq0/a;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    sget-object v0, Lf1/l0;->a:Lf1/l0;

    check-cast p1, Lq0/a;

    iget-object v0, p1, Lq0/a;->k:Ljava/lang/String;

    iget-object v2, p0, Lq0/a;->k:Ljava/lang/String;

    invoke-static {v0, v2}, Lf1/l0;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object p1, p1, Lq0/a;->j:Ljava/lang/String;

    iget-object v0, p0, Lq0/a;->j:Ljava/lang/String;

    invoke-static {p1, v0}, Lf1/l0;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 v1, 0x1

    :cond_1
    return v1
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lq0/a;->k:Ljava/lang/String;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_0
    iget-object v1, p0, Lq0/a;->j:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    xor-int/2addr v0, v1

    return v0
.end method
