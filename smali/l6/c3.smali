.class public final synthetic Ll6/c3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lq6/n;


# instance fields
.field public final synthetic a:Ll6/f3;

.field public final synthetic b:Lq6/m;

.field public final synthetic c:Ljava/util/Map;


# direct methods
.method public synthetic constructor <init>(Ll6/f3;Lq6/m;Ljava/util/Map;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll6/c3;->a:Ll6/f3;

    iput-object p2, p0, Ll6/c3;->b:Lq6/m;

    iput-object p3, p0, Ll6/c3;->c:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 3

    iget-object v0, p0, Ll6/c3;->a:Ll6/f3;

    iget-object v1, p0, Ll6/c3;->b:Lq6/m;

    iget-object v2, p0, Ll6/c3;->c:Ljava/util/Map;

    check-cast p1, Landroid/database/Cursor;

    invoke-static {v0, v1, v2, p1}, Ll6/f3;->j(Ll6/f3;Lq6/m;Ljava/util/Map;Landroid/database/Cursor;)V

    return-void
.end method
