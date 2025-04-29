.class public final Ll0/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Li8/a;


# instance fields
.field private j:Ll0/c;

.field private k:Ll0/a;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public d(Li8/a$b;)V
    .locals 1

    iget-object p1, p0, Ll0/b;->j:Ll0/c;

    if-nez p1, :cond_0

    const-string p1, "GeocodingPlugin"

    const-string v0, "Already detached from the engine."

    invoke-static {p1, v0}, Landroid/util/Log;->wtf(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_0
    invoke-virtual {p1}, Ll0/c;->d()V

    const/4 p1, 0x0

    iput-object p1, p0, Ll0/b;->j:Ll0/c;

    iput-object p1, p0, Ll0/b;->k:Ll0/a;

    return-void
.end method

.method public m(Li8/a$b;)V
    .locals 2

    new-instance v0, Ll0/a;

    invoke-virtual {p1}, Li8/a$b;->a()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Ll0/a;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Ll0/b;->k:Ll0/a;

    new-instance v1, Ll0/c;

    invoke-direct {v1, v0}, Ll0/c;-><init>(Ll0/a;)V

    iput-object v1, p0, Ll0/b;->j:Ll0/c;

    invoke-virtual {p1}, Li8/a$b;->b()Lr8/c;

    move-result-object p1

    invoke-virtual {v1, p1}, Ll0/c;->c(Lr8/c;)V

    return-void
.end method
