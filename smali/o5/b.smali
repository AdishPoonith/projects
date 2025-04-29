.class public abstract Lo5/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo5/b$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<SerializationT::",
        "Lo5/n;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field private final a:Lv5/a;

.field private final b:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "TSerializationT;>;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>(Lv5/a;Ljava/lang/Class;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lv5/a;",
            "Ljava/lang/Class<",
            "TSerializationT;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo5/b;->a:Lv5/a;

    iput-object p2, p0, Lo5/b;->b:Ljava/lang/Class;

    return-void
.end method

.method synthetic constructor <init>(Lv5/a;Ljava/lang/Class;Lo5/b$a;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lo5/b;-><init>(Lv5/a;Ljava/lang/Class;)V

    return-void
.end method

.method public static a(Lo5/b$b;Lv5/a;Ljava/lang/Class;)Lo5/b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<SerializationT::",
            "Lo5/n;",
            ">(",
            "Lo5/b$b<",
            "TSerializationT;>;",
            "Lv5/a;",
            "Ljava/lang/Class<",
            "TSerializationT;>;)",
            "Lo5/b<",
            "TSerializationT;>;"
        }
    .end annotation

    new-instance v0, Lo5/b$a;

    invoke-direct {v0, p1, p2, p0}, Lo5/b$a;-><init>(Lv5/a;Ljava/lang/Class;Lo5/b$b;)V

    return-object v0
.end method


# virtual methods
.method public final b()Lv5/a;
    .locals 1

    iget-object v0, p0, Lo5/b;->a:Lv5/a;

    return-object v0
.end method

.method public final c()Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "TSerializationT;>;"
        }
    .end annotation

    iget-object v0, p0, Lo5/b;->b:Ljava/lang/Class;

    return-object v0
.end method

.method public abstract d(Lo5/n;Lg5/x;)Lg5/f;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TSerializationT;",
            "Lg5/x;",
            ")",
            "Lg5/f;"
        }
    .end annotation
.end method
