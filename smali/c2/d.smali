.class public final Lc2/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx1/n;


# instance fields
.field private final j:J

.field private final k:Lx1/n;


# direct methods
.method public constructor <init>(JLx1/n;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lc2/d;->j:J

    iput-object p3, p0, Lc2/d;->k:Lx1/n;

    return-void
.end method

.method static synthetic a(Lc2/d;)J
    .locals 2

    iget-wide v0, p0, Lc2/d;->j:J

    return-wide v0
.end method


# virtual methods
.method public d(II)Lx1/e0;
    .locals 1

    iget-object v0, p0, Lc2/d;->k:Lx1/n;

    invoke-interface {v0, p1, p2}, Lx1/n;->d(II)Lx1/e0;

    move-result-object p1

    return-object p1
.end method

.method public k()V
    .locals 1

    iget-object v0, p0, Lc2/d;->k:Lx1/n;

    invoke-interface {v0}, Lx1/n;->k()V

    return-void
.end method

.method public t(Lx1/b0;)V
    .locals 2

    iget-object v0, p0, Lc2/d;->k:Lx1/n;

    new-instance v1, Lc2/d$a;

    invoke-direct {v1, p0, p1}, Lc2/d$a;-><init>(Lc2/d;Lx1/b0;)V

    invoke-interface {v0, v1}, Lx1/n;->t(Lx1/b0;)V

    return-void
.end method
