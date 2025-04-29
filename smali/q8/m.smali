.class public Lq8/m;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lq8/m$b;,
        Lq8/m$a;
    }
.end annotation


# instance fields
.field public final a:Lr8/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lr8/a<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Le8/a;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lr8/a;

    sget-object v1, Lr8/f;->a:Lr8/f;

    const-string v2, "flutter/settings"

    invoke-direct {v0, p1, v2, v1}, Lr8/a;-><init>(Lr8/c;Ljava/lang/String;Lr8/i;)V

    iput-object v0, p0, Lq8/m;->a:Lr8/a;

    return-void
.end method


# virtual methods
.method public a()Lq8/m$a;
    .locals 2

    new-instance v0, Lq8/m$a;

    iget-object v1, p0, Lq8/m;->a:Lr8/a;

    invoke-direct {v0, v1}, Lq8/m$a;-><init>(Lr8/a;)V

    return-object v0
.end method
