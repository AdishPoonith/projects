.class public Lq8/o;
.super Ljava/lang/Object;
.source "SourceFile"


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

    const-string v2, "flutter/system"

    invoke-direct {v0, p1, v2, v1}, Lr8/a;-><init>(Lr8/c;Ljava/lang/String;Lr8/i;)V

    iput-object v0, p0, Lq8/o;->a:Lr8/a;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 3

    const-string v0, "SystemChannel"

    const-string v1, "Sending memory pressure warning to Flutter."

    invoke-static {v0, v1}, Ld8/b;->f(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, Ljava/util/HashMap;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(I)V

    const-string v1, "type"

    const-string v2, "memoryPressure"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, p0, Lq8/o;->a:Lr8/a;

    invoke-virtual {v1, v0}, Lr8/a;->c(Ljava/lang/Object;)V

    return-void
.end method
