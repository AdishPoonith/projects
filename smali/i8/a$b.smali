.class public Li8/a$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Li8/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Lio/flutter/embedding/engine/a;

.field private final c:Lr8/c;

.field private final d:Lio/flutter/view/e;

.field private final e:Lio/flutter/plugin/platform/h;

.field private final f:Li8/a$a;

.field private final g:Lio/flutter/embedding/engine/d;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lio/flutter/embedding/engine/a;Lr8/c;Lio/flutter/view/e;Lio/flutter/plugin/platform/h;Li8/a$a;Lio/flutter/embedding/engine/d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li8/a$b;->a:Landroid/content/Context;

    iput-object p2, p0, Li8/a$b;->b:Lio/flutter/embedding/engine/a;

    iput-object p3, p0, Li8/a$b;->c:Lr8/c;

    iput-object p4, p0, Li8/a$b;->d:Lio/flutter/view/e;

    iput-object p5, p0, Li8/a$b;->e:Lio/flutter/plugin/platform/h;

    iput-object p6, p0, Li8/a$b;->f:Li8/a$a;

    iput-object p7, p0, Li8/a$b;->g:Lio/flutter/embedding/engine/d;

    return-void
.end method


# virtual methods
.method public a()Landroid/content/Context;
    .locals 1

    iget-object v0, p0, Li8/a$b;->a:Landroid/content/Context;

    return-object v0
.end method

.method public b()Lr8/c;
    .locals 1

    iget-object v0, p0, Li8/a$b;->c:Lr8/c;

    return-object v0
.end method

.method public c()Lio/flutter/plugin/platform/h;
    .locals 1

    iget-object v0, p0, Li8/a$b;->e:Lio/flutter/plugin/platform/h;

    return-object v0
.end method

.method public d()Lio/flutter/view/e;
    .locals 1

    iget-object v0, p0, Li8/a$b;->d:Lio/flutter/view/e;

    return-object v0
.end method
