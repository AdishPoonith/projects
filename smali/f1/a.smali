.class public final Lf1/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lf1/a$a;,
        Lf1/a$c;,
        Lf1/a$b;
    }
.end annotation


# static fields
.field public static final f:Lf1/a$a;

.field private static final g:Ljava/lang/String;

.field public static h:Lf1/a;


# instance fields
.field private a:Ljava/lang/String;

.field private b:J

.field private c:Ljava/lang/String;

.field private d:Ljava/lang/String;

.field private e:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lf1/a$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lf1/a$a;-><init>(Lkotlin/jvm/internal/g;)V

    sput-object v0, Lf1/a;->f:Lf1/a$a;

    const-class v0, Lf1/a;

    invoke-virtual {v0}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lf1/a;->g:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final synthetic a(Lf1/a;)J
    .locals 2

    iget-wide v0, p0, Lf1/a;->b:J

    return-wide v0
.end method

.method public static final synthetic b()Ljava/lang/String;
    .locals 1

    sget-object v0, Lf1/a;->g:Ljava/lang/String;

    return-object v0
.end method

.method public static final synthetic c(Lf1/a;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lf1/a;->a:Ljava/lang/String;

    return-void
.end method

.method public static final synthetic d(Lf1/a;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lf1/a;->d:Ljava/lang/String;

    return-void
.end method

.method public static final synthetic e(Lf1/a;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lf1/a;->c:Ljava/lang/String;

    return-void
.end method

.method public static final synthetic f(Lf1/a;J)V
    .locals 0

    iput-wide p1, p0, Lf1/a;->b:J

    return-void
.end method

.method public static final synthetic g(Lf1/a;Z)V
    .locals 0

    iput-boolean p1, p0, Lf1/a;->e:Z

    return-void
.end method


# virtual methods
.method public final h()Ljava/lang/String;
    .locals 1

    sget-object v0, Lp0/f0;->a:Lp0/f0;

    invoke-static {}, Lp0/f0;->F()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lp0/f0;->k()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lf1/a;->a:Ljava/lang/String;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public final i()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lf1/a;->d:Ljava/lang/String;

    return-object v0
.end method

.method public final j()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lf1/a;->c:Ljava/lang/String;

    return-object v0
.end method

.method public final k()Z
    .locals 1

    iget-boolean v0, p0, Lf1/a;->e:Z

    return v0
.end method
