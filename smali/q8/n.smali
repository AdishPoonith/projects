.class public Lq8/n;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lq8/n$b;
    }
.end annotation


# instance fields
.field public final a:Lr8/k;

.field private b:Lq8/n$b;

.field public final c:Lr8/k$c;


# direct methods
.method public constructor <init>(Le8/a;)V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lq8/n$a;

    invoke-direct {v0, p0}, Lq8/n$a;-><init>(Lq8/n;)V

    iput-object v0, p0, Lq8/n;->c:Lr8/k$c;

    new-instance v1, Lr8/k;

    sget-object v2, Lr8/s;->b:Lr8/s;

    const-string v3, "flutter/spellcheck"

    invoke-direct {v1, p1, v3, v2}, Lr8/k;-><init>(Lr8/c;Ljava/lang/String;Lr8/l;)V

    iput-object v1, p0, Lq8/n;->a:Lr8/k;

    invoke-virtual {v1, v0}, Lr8/k;->e(Lr8/k$c;)V

    return-void
.end method

.method static synthetic a(Lq8/n;)Lq8/n$b;
    .locals 0

    iget-object p0, p0, Lq8/n;->b:Lq8/n$b;

    return-object p0
.end method


# virtual methods
.method public b(Lq8/n$b;)V
    .locals 0

    iput-object p1, p0, Lq8/n;->b:Lq8/n$b;

    return-void
.end method
