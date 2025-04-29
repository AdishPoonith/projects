.class public final synthetic Ll6/d3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lq6/n;


# instance fields
.field public final synthetic a:Ll6/f3;

.field public final synthetic b:Lq6/m;

.field public final synthetic c:Ljava/util/Map;

.field public final synthetic d:Lq6/t;


# direct methods
.method public synthetic constructor <init>(Ll6/f3;Lq6/m;Ljava/util/Map;Lq6/t;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll6/d3;->a:Ll6/f3;

    iput-object p2, p0, Ll6/d3;->b:Lq6/m;

    iput-object p3, p0, Ll6/d3;->c:Ljava/util/Map;

    iput-object p4, p0, Ll6/d3;->d:Lq6/t;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 4

    iget-object v0, p0, Ll6/d3;->a:Ll6/f3;

    iget-object v1, p0, Ll6/d3;->b:Lq6/m;

    iget-object v2, p0, Ll6/d3;->c:Ljava/util/Map;

    iget-object v3, p0, Ll6/d3;->d:Lq6/t;

    check-cast p1, Landroid/database/Cursor;

    invoke-static {v0, v1, v2, v3, p1}, Ll6/f3;->h(Ll6/f3;Lq6/m;Ljava/util/Map;Lq6/t;Landroid/database/Cursor;)V

    return-void
.end method
