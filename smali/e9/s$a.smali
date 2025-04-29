.class final Le9/s$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Le9/s;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation


# instance fields
.field final a:Landroid/content/Context;

.field final b:Lr8/c;

.field final c:Le9/s$c;

.field final d:Le9/s$b;

.field final e:Lio/flutter/view/e;


# direct methods
.method constructor <init>(Landroid/content/Context;Lr8/c;Le9/s$c;Le9/s$b;Lio/flutter/view/e;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le9/s$a;->a:Landroid/content/Context;

    iput-object p2, p0, Le9/s$a;->b:Lr8/c;

    iput-object p3, p0, Le9/s$a;->c:Le9/s$c;

    iput-object p4, p0, Le9/s$a;->d:Le9/s$b;

    iput-object p5, p0, Le9/s$a;->e:Lio/flutter/view/e;

    return-void
.end method


# virtual methods
.method a(Le9/s;Lr8/c;)V
    .locals 0

    invoke-static {p2, p1}, Le9/l;->m(Lr8/c;Le9/m$a;)V

    return-void
.end method

.method b(Lr8/c;)V
    .locals 1

    const/4 v0, 0x0

    invoke-static {p1, v0}, Le9/l;->m(Lr8/c;Le9/m$a;)V

    return-void
.end method
